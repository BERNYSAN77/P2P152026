package progreso1.ejertienda.negocio;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    public Producto(){
        /*
        puedo dejar vacío para que Java me ponga los valores por defecto
        puedo inicializar con los valores por defecto de Java de forma explícita
        puedo inicializar con valores que yo desee como defecto
         */
    }
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    /*
    métodos get()-> sacar la información de mis atributos
    siempre retorna valor -> generalmente es del mismo tipo del atributo
    no reciben parámetros
     */
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }

    /*
    métodos set -> modificar los atributos
    generalmente será void
    siempre recibe parámetro -> generalmente es del mismo tipo del atributo
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
}
