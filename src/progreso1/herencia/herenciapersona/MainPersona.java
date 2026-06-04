package progreso1.herencia.herenciapersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cedula = null, nombre = null, universidad= null, carrera = null;
        int hora, opc;
        List<Persona> listado = new ArrayList<Persona>();
        do{
            menu();
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1: {
                    //lectura de datos
                    listado.add(new AlumnoPregrado(cedula,nombre,universidad,carrera));
                }break;
                case 4:{
                    for(Persona p:listado){
                        System.out.println(p);
                    }
                }
            }

        }while(opc != 9);

    }
    public static void menu(){
        System.out.println("1. Ingresar alumno pregrado");
        System.out.println("2. Ingresar alumno maestria");
        System.out.println("3. Ingresar profesor hora");
        System.out.println("4. Mostrar listado");
        System.out.println("5. Mostrar alumno pregrado");
        System.out.println("6. Mostrar alumno maestria");
        System.out.println("7. Mostrar profesor hora");
        System.out.println("8. Pagar nomina");
        System.out.println("9. Salir");

    }
}
