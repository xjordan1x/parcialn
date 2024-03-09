package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

public class MaximoEnVector {
    public static void main(String[] args) {
        int[] vector = {3, 5, 7, 2, 8, 9, 1};

        int maximo = encontrarMaximo(vector);

        System.out.println("El elemento máximo en el vector es: " + maximo);
    }

    public static int encontrarMaximo(int[] vector) {
        int maximo = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }

        return maximo;
    }
}
