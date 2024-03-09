package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EliminarClavesMenores {
    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 5);
        mapa.put("clave4", 30);


        int valorCorte = 15;


        eliminarClavesMenoresQue(mapa, valorCorte);


        System.out.println("HashMap después de eliminar claves con valores menores que " + valorCorte + ": " + mapa);
    }

    public static void eliminarClavesMenoresQue(HashMap<String, Integer> mapa, int valorCorte) {
        Iterator<Map.Entry<String, Integer>> iterador = mapa.entrySet().iterator();

        while (iterador.hasNext()) {
            Map.Entry<String, Integer> entrada = iterador.next();
            if (entrada.getValue() < valorCorte) { // Si el valor es menor que el número dado
                iterador.remove();
            }
        }
    }
}
