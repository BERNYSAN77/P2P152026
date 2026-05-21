package progreso1.herencia.introduccion;

public class MainHerencia {
    public static void main(String[] args) {
        ClaseC cc = new ClaseC(-1,-2,3,4);
        cc.mostrarDatos();
        cc.a2 = -100;
        System.out.println("a2: "+cc.a2);
    }
}
