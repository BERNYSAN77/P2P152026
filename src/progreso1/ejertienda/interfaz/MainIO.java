package progreso1.ejertienda.interfaz;

import javax.swing.*;
import java.util.Scanner;

public class MainIO {
    public static void main(String[] args) {
        String nombre, apellido, ciudadResidencia;
        double salario;
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();*/

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();

      //  System.out.print("Ingrese su salario: ");
        //salario = sc.nextDouble();
       // salario = Double.parseDouble(sc.nextLine());
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));

        System.out.print("Ingrese ciudad de residencia: ");
        ciudadResidencia = sc.nextLine();


      /*  System.out.println("Su nombre completo es: "+nombre+" "+apellido);
        System.out.println("Salario: "+salario);
        System.out.println("Ciudad residencia: "+ciudadResidencia);*/
        JOptionPane.showMessageDialog(null,"Su nombre completo es: "+nombre+" "+apellido+
                "\nSalario: "+salario+ "\nCiudad residencia: "+ciudadResidencia);

    }
}
