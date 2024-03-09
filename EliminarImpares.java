package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class EliminarImpares {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        eliminarImpares(lista);

        System.out.println("Lista después de eliminar elementos impares: " + lista);
    }

    public static void eliminarImpares(ArrayList<Integer> lista) {
        Iterator<Integer> iterador = lista.iterator();

        while (iterador.hasNext()) {
            Integer numero = iterador.next();
            if (numero % 2 != 0) {
                iterador.remove();
            }
        }
    }
}