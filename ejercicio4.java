package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad inicial invertida");
        double inicial= scanner.nextDouble();
        System.out.println("ingrese la tasa de interes anual: ");
        double tasa = scanner.nextDouble();
        System.out.println("ingrese el numero de años");
        int anios = scanner.nextInt();
        double resultado = inicial * Math.pow(1+ (tasa/100), anios);
        System.out.println("El resultado despues de " + anios +" años es:" + resultado);
    }
}