package progreso1.examen.interfaz;

import progreso1.examen.negocio.SuscripcionDigital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainLista {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String cliente;
        String plan;
        double costo;
        int meses, opc;
        List<SuscripcionDigital> suscripciones= new ArrayList<SuscripcionDigital>();
        int indice = 0;
        do{

            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{

                        System.out.print("Ingrese el nombre del cliente: ");
                        cliente = sc.nextLine();
                        System.out.print("Ingrese el nombre del plan: ");
                        plan = sc.nextLine();
                        System.out.print("Ingrese el número de meses: ");
                        meses = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingrese el costo mensual: ");
                        costo = Double.parseDouble(sc.nextLine());
                        suscripciones.add(new SuscripcionDigital(cliente,plan,costo,meses));
             }break;
                case 2:{
                    if(!suscripciones.isEmpty()){
                        System.out.print("Ingrese el nombre del cliente a evaluar rentabilidad: ");
                        cliente = sc.nextLine();
                        boolean encontro = false;
                        for(int i = 0; i < suscripciones.size(); i++){
                            if(suscripciones.get(i).getNombreCliente().equals(cliente)) {
                                System.out.println(suscripciones.get(i).evaluarRentabilidad());
                                encontro = true;
                                break;
                            }
                        }
                        if(!encontro){
                            System.out.println("El cliente no existe");
                        }

                    }else
                        System.out.println("No existe ninguna suscripción");

                }break;
                case 3:{
                    if(!suscripciones.isEmpty()) {
                        for (SuscripcionDigital sd : suscripciones) {
                            sd.mostrarResumen();
                        }
                    }

                    else
                        System.out.println("No existe ninguna suscripción");
                }break;
                case 4:{
                    Iterator<SuscripcionDigital> it = suscripciones.iterator();
                    while (it.hasNext()){
                        SuscripcionDigital sd = it.next();

                        if (sd.calcularTotalPagado()>650){
                            System.out.println("Nombre: " +sd.getNombreCliente());
                            System.out.println("Plan: " +sd.getPlan());
                        }

                    }
                }break;


                case 5:{
                    System.out.println("Gracias por utilizar nuestra empresa");
                }break;
                default:
                    System.out.println("No es una opción válida");
            }
        }while(opc != 5);
    }
    public static void menu(){
        System.out.println("*********Plataforma virtual*********");
        System.out.println("1. Ingresar Suscripción");
        System.out.println("2. Evaluar rentabilidad");
        System.out.println("3. Mostrar suscripción");
        System.out.println("4. Mostrar clientes mayores a $650");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
    }
}


