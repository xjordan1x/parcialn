package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Random;
import java.util.Scanner;

public class ejercicio2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = { "piedra", "papel", "tijera"};
        System.out.println("Ingrese una opciòn (piedra, papel,tijera): ");
        String Usuario = scanner.nextLine();
        int EleccionComputadora = random.nextInt(3);
        String Computadora =
    opciones[EleccionComputadora];
        System.out.println("El resultado de la computadora es: " + Computadora);
        if (Usuario.equals(Computadora)){
            System.out.println("Es un empate");
        }else if ((Usuario.equals("piedra")&& Computadora.equals("Tijera")) || (Usuario.equals("papel") && Computadora.equals("piedra")) ||(Usuario.equals("tijera")&& Computadora.equals("papel"))){
            System.out.println("ganaste");
        }else {
            System.out.println("gano la computadora");
        }
    }
}
