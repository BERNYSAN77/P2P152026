package progreso1.examen.interfaz;

import progreso1.examen.negocio.SuscripcionDigital;

import java.util.Scanner;

public class MainSuscripcion {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String cliente;
        String plan;
        double costo;
        int meses, opc;
        SuscripcionDigital sd = null;

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
                    sd = new SuscripcionDigital(cliente,plan,costo,meses);
                  //  arreglo[i] = new SuscripcionDigital(cliente,plan,costo,meses);
                   // lista.add(new SuscripcionDigital(cliente,plan,costo,meses));

                }break;
                case 2:{
                    if(sd != null)
                        System.out.println(sd.evaluarRentabilidad());
                  //  System.out.println(arreglo[i].evaluarRentabilidad());
                 //   System.out.println(lista.get(i).evaluarRentabilidad());
                    else
                        System.out.println("No existe ninguna suscripción");

                }break;
                case 3:{
                    if(sd != null)
                        sd.mostrarResumen();
                    else
                        System.out.println("No existe ninguna suscripción");
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
