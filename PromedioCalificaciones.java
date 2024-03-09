package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        HashMap<String, List<Double>> calificacionesEstudiantes = new HashMap<>();
        calificacionesEstudiantes.put("Juan", List.of(4.5, 3.8, 4.2));
        calificacionesEstudiantes.put("Ana", List.of(5.0, 4.4, 4.8));
        calificacionesEstudiantes.put("Luis", List.of(3.6, 3.2, 3.4));

        for (Map.Entry<String, List<Double>> entrada : calificacionesEstudiantes.entrySet()) {
            double suma = 0;
            for (Double calificacion : entrada.getValue()) {
                suma += calificacion;
            }
            double promedio = suma / entrada.getValue().size();
            System.out.println("El promedio de " + entrada.getKey() + " es: " + promedio);
        }
    }
}