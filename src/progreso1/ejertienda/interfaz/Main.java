package progreso1.ejertienda.interfaz;

import progreso1.ejertienda.negocio.Producto;

public class Main {
    public static void main(String[] args) {
        Producto pr1 = new Producto("cartulina",-0.30,-100);
        Producto pr2 = new Producto();

        System.out.println("Datos del objeto pr1");
        System.out.println("Nombre: "+pr1.getNombre());
        System.out.println("Precio: "+pr1.getPrecio());
        System.out.println("Stock: "+pr1.getStock());

        System.out.println("\nDatos del objeto pr2");
        System.out.println("Nombre: "+pr2.getNombre());
        System.out.println("Precio: "+pr2.getPrecio());
        System.out.println("Stock: "+pr2.getStock());

        pr2.setNombre("catuchera");
        pr2.setPrecio(5.80);
        pr2.setStock(20);

        System.out.println("\nDatos del objeto pr2 después de los set()");
        System.out.println("Nombre: "+pr2.getNombre());
        System.out.println("Precio: "+pr2.getPrecio());
        System.out.println("Stock: "+pr2.getStock());

        pr2.setPrecio(-5.2);
        pr2.setStock(-10);

        System.out.println("\nDatos del objeto pr2 después de los set()");
        System.out.println("Nombre: "+pr2.getNombre());
        System.out.println("Precio: "+pr2.getPrecio());
        System.out.println("Stock: "+pr2.getStock());
    }
}
