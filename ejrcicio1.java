package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

public class ejrcicio1{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor ingresa un año");
       int numero = scanner.nextInt();
       scanner.close();
       if ((numero % 4 == 0 && numero % 100 != 0) || numero % 400 == 0) {
           System.out.println( numero + "Es un año bisiestro.");

       } else{
           System.out.println(numero + "No es un año bisiestro. ");
       }
    }
}