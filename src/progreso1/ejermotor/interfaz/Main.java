package progreso1.ejermotor.interfaz;


import progreso1.ejermotor.negocio.Motor;

public class Main {
    public static void main(String[] args) {

        Motor m1 = new Motor();
        m1.encender();
        m1.encender();
        m1.ajustarVelocidad(60);
        m1.mostrarDatos();
        m1.ajustarVelocidad(-100);
        m1.mostrarDatos();
        m1.apagar();
        m1.ajustarVelocidad(20);
    }
}