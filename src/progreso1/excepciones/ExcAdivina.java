package progreso1.excepciones;

import java.util.Scanner;

public class ExcAdivina {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número entre 1 y 10: ");
        num = Integer.parseInt(sc.nextLine());

        if(num == 7){
            throw new Exception("Lastimosamente ingresó el número prohibido, usted ha sido eliminado");
        }
        System.out.println("El número ingresado fue: "+num);
    }

}
