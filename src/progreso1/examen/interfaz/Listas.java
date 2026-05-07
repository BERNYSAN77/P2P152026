package progreso1.examen.interfaz;

import progreso1.examen.negocio.SuscripcionDigital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<SuscripcionDigital> lista = new ArrayList<SuscripcionDigital>();

        lista.add(new SuscripcionDigital("juan","basico",52,5));
        lista.add(new SuscripcionDigital("pedro","premiun",120,13));
        lista.add(new SuscripcionDigital("rosa","plata",85,10));

        //imprimir
        System.out.println("For de colección");
        for(SuscripcionDigital sd:lista){
            sd.mostrarResumen();
        }

        System.out.println("for normal");
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).mostrarResumen();
        }

        System.out.println("iterator");
        Iterator<SuscripcionDigital> it = lista.iterator();
        while(it.hasNext()){
            it.next().mostrarResumen();
        }
    }
}
