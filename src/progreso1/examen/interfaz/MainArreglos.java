package progreso1.examen.interfaz;

import progreso1.examen.negocio.SuscripcionDigital;

import java.util.Scanner;

public class MainArreglos {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String cliente;
        String plan;
        double costo;
        int meses, opc;
        final int MAX = 20;
        SuscripcionDigital suscripciones[] = new SuscripcionDigital[MAX];
        int indice = 0;
        do{

            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{
                    if(indice < MAX){
                        System.out.print("Ingrese el nombre del cliente: ");
                        cliente = sc.nextLine();
                        System.out.print("Ingrese el nombre del plan: ");
                        plan = sc.nextLine();
                        System.out.print("Ingrese el número de meses: ");
                        meses = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingrese el costo mensual: ");
                        costo = Double.parseDouble(sc.nextLine());
                        suscripciones[indice++] = new SuscripcionDigital(cliente,plan,costo,meses);
                    }else{
                        System.out.println("No existe espacio para mas suscripciones");
                    }


                }break;
                case 2:{
                    if(indice > 0){
                        System.out.print("Ingrese el nombre del cliente a evaluar rentabilidad: ");
                        cliente = sc.nextLine();
                        boolean encontro = false;
                        for(int i = 0; i < indice; i++){
                            if(suscripciones[i].getNombreCliente().equals(cliente)) {
                                System.out.println(suscripciones[i].evaluarRentabilidad());
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
                 /*   if(sd != null)
                        sd.mostrarResumen();
                    else
                        System.out.println("No existe ninguna suscripción");*/
                }break;
                case 4:{
                    System.out.println("Gracias por utilizar nuestra empresa");
                }break;
                default:
                    System.out.println("No es una opción válida");
            }
        }while(opc != 4);
    }
    public static void menu(){
        System.out.println("*********Plataforma virtual*********");
        System.out.println("1. Ingresar Suscripción");
        System.out.println("2. Evaluar rentabilidad");
        System.out.println("3. Mostrar suscripción");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
    }
}

