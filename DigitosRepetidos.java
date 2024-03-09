import java.util.Scanner;

public class DigitosRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = scanner.nextInt();
        while (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo:");
            numero = scanner.nextInt();
        }
        System.out.println("Ingrese un dígito:");
        int digito = scanner.nextInt();
        while (digito < 0 || digito > 9) {
            System.out.println("Por favor, ingrese un solo dígito:");
            digito = scanner.nextInt();
        }
        int contador = contarDigitosRepetidos(numero, digito);

        System.out.println("El dígito " + digito + " aparece " + contador + " veces en el número " + numero);

        scanner.close();
    }

    public static int contarDigitosRepetidos(int numero, int digito) {
        int contador = 0;
        while (numero > 0) {
            int digitoActual = numero % 10;
            if (digitoActual == digito) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }
}

public class OrdenamientoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar tres números enteros
        System.out.println("Ingrese el primer número entero:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número entero:");
        int numero3 = scanner.nextInt();

        // Determinar el mayor, el intermedio y el menor utilizando condicionales
        int mayor, intermedio, menor;

        // Mayor número
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
            intermedio = (numero2 >= numero3) ? numero2 : numero3;
            menor = (numero2 >= numero3) ? numero3 : numero2;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
            intermedio = (numero1 >= numero3) ? numero1 : numero3;
            menor = (numero1 >= numero3) ? numero3 : numero1;
        } else {
            mayor = numero3;
            intermedio = (numero1 >= numero2) ? numero1 : numero2;
            menor = (numero1 >= numero2) ? numero2 : numero1;
        }

        // Mostrar los números en orden ascendente
        System.out.println("Los números en orden ascendente son:");
        System.out.println(menor + ", " + intermedio + ", " + mayor);

        scanner.close();
    }
}

public class GeneracionNumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar dos números enteros aleatorios entre 1 y 10
        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;

        // Calcular la suma de los dos números generados
        int sumaCorrecta = numero1 + numero2;

        // Solicitar al usuario ingresar la suma de los dos números
        System.out.println("Por favor, ingrese la suma de " + numero1 + " y " + numero2 + ":");
        int sumaIngresada = scanner.nextInt();

        // Verificar si la respuesta es correcta
        if (sumaIngresada == sumaCorrecta) {
            System.out.println("¡Respuesta correcta!");
        } else {
            System.out.println("Respuesta incorrecta. La suma correcta es: " + sumaCorrecta);
        }

        scanner.close();
    }
}

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números enteros positivos
        System.out.println("Ingrese el primer número entero positivo:");
        int numero1 = scanner.nextInt();

        // Validar si el número ingresado es positivo
        while (numero1 <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo:");
            numero1 = scanner.nextInt();
        }

        System.out.println("Ingrese el segundo número entero positivo:");
        int numero2 = scanner.nextInt();

        // Validar si el número ingresado es positivo
        while (numero2 <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo:");
            numero2 = scanner.nextInt();
        }

        // Calcular el máximo común divisor (MCD) utilizando el algoritmo de Euclides
        int mcd = calcularMCD(numero1, numero2);

        // Mostrar el máximo común divisor (MCD)
        System.out.println("El máximo común divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);

        scanner.close();
    }

    // Método para calcular el máximo común divisor (MCD) utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }public class SumaElementosVector {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario el tamaño del vector
            System.out.println("Ingrese el tamaño del vector:");
            int tamaño = scanner.nextInt();

            // Crear un vector de enteros con el tamaño especificado
            int[] vector = new int[tamaño];

            // Solicitar al usuario ingresar los elementos del vector
            System.out.println("Ingrese los elementos del vector:");
            for (int i = 0; i < tamaño; i++) {
                System.out.println("Elemento " + (i + 1) + ":");
                vector[i] = scanner.nextInt();
            }

            // Calcular la suma de todos los elementos del vector
            int suma = calcularSuma(vector);

            // Mostrar la suma de los elementos del vector
            System.out.println("La suma de todos los elementos del vector es: " + suma);

            scanner.close();
        }

        // Método para calcular la suma de todos los elementos en un vector de enteros
        public static int calcularSuma(int[] vector) {
            int suma = 0;
            for (int elemento : vector) {
                suma += elemento;
            }
            return suma;
        }
    }

}


public class ProductoElementosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del vector
        System.out.println("Ingrese el tamaño del vector:");
        int tamaño = scanner.nextInt();

        // Crear un vector de enteros con el tamaño especificado
        int[] vector = new int[tamaño];

        // Solicitar al usuario ingresar los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vector[i] = scanner.nextInt();
        }

        // Calcular el producto de todos los números pares en el vector
        int producto = calcularProductoElementosPares(vector);

        // Mostrar el producto de los números pares en el vector
        System.out.println("El producto de todos los números pares en el vector es: " + producto);

        scanner.close();
    }

    // Método para calcular el producto de todos los números pares en un vector de enteros
    public static int calcularProductoElementosPares(int[] vector) {
        int producto = 1;
        for (int elemento : vector) {
            if (elemento % 2 == 0) {
                producto *= elemento;
            }
        }
        return producto;
    }
}
