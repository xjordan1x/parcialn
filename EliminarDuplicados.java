package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class EliminarDuplicados {
    public static void main(String[] args) {
        ArrayList<Integer> listaConDuplicados = new ArrayList<>(Arrays.asList(1, 5, 2, 1, 3, 5, 2, 4, 4));

        ArrayList<Integer> listaSinDuplicados = eliminarDuplicados(listaConDuplicados);

        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }

    public static ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> lista) {
        LinkedHashSet<Integer> conjunto = new LinkedHashSet<>(lista);

        return new ArrayList<>(conjunto);
    }
}
