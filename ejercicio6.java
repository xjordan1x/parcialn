package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo");
        int filas = scanner.nextInt();
        for( int i=1; i <= filas; i++) {
            for( int j = 1; j<= i; j++){
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
