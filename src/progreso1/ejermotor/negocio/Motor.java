package progreso1.ejermotor.negocio;

public class Motor {
    private boolean estado;
    private int velocidad;


    public void encender(){
        if(estado)
            System.out.println("El motor ya se encuentra encendido");
        else{
            estado = true;
            System.out.println("El motor se ha encendido");

        }
    }
    public void apagar(){
        if(estado){
            estado = false;
            velocidad = 0;
            System.out.println("El motor ha sido apagado");}
        else{
            System.out.println("El motor se encuentra apagado");
        }
    }
    public void ajustarVelocidad(int nuevaVelocidad){
       if(estado){
           if (nuevaVelocidad < 0 || nuevaVelocidad > 100){
               System.out.println("El dato es erroneo");
           }else{
               velocidad = nuevaVelocidad;
           }
       }else
           System.out.println("no se puede setear velocidad si el motor està apagado");

    }
    public void mostrarDatos(){
        if(estado){
            System.out.println("El motor esta Encendido y la velocidad es: "+velocidad);

        }
        else System.out.println("El motor esta Apagado");
    }
}
