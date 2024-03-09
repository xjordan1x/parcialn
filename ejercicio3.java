package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero");
        double cantidad = scanner.nextDouble();
        System.out.println("ingresa la tasa de cambios");
        double cambio = scanner.nextDouble();
        double resultado = cantidad * cambio;
        System.out.println("El resultado de la conversion es: " + resultado);
    }
}
