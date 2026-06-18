package progreso1.excepciones;

public class ExcCadena {
    public static void main(String[] args) {
        try{
            a(60);
            System.out.println("Retiro exitoso");
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Gracias por confiar en nosotros");

    }

    public static void a(int num) throws Exception{
        b(num);
    }

    public static void b(int num) throws Exception{
        c(num);
    }

    public static void c(int num) throws Exception{
        if(num < 100){
            throw new Exception("El valor mínimo a retirar debe ser 100");
        }
    }

}
