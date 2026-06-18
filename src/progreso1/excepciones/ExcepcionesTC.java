package progreso1.excepciones;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ExcepcionesTC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        try{
            try{
                System.out.print("Ingrese el nombre: ");
                nombre = sc.nextLine();
                System.out.print("Ingrese la edad: ");
                edad = Integer.parseInt(sc.nextLine());

                //}catch(NumberFormatException nfe){
            }catch(ArithmeticException nfe){
                System.out.println("Se esperaba que ingrese un número");
            }finally{
                System.out.println("En el bloque finally");
            }
        }catch(NullPointerException npe){
            System.out.println("No se ha creado el objeto");
        }catch(Exception e){
            System.out.println("Se produjo un error inesperado");
        }

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: " + edad);

        System.out.println("Gracias por usar nuestros servicios");
    }
}
