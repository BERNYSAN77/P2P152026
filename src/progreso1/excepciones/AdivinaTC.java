package progreso1.excepciones;

import java.util.Scanner;

public class AdivinaTC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número entre 1 y 10: ");
        num = Integer.parseInt(sc.nextLine());

        try{
            if(num == 7){
                throw new Exception("Lastimosamente ingresó el número prohibido, usted ha sido eliminado");
            }
        }catch(Exception e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("El número ingresado fue: "+num);
    }
}
