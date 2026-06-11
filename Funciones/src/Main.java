import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(calcularAreaRectangulo(7,5));
        System.out.println(convertirAMayusculas("Probando probando"));
        mostrarMenu();

        System.out.println(esPar(3));
        System.out.println(calcularCuadrado(125));
        //System.out.println(calcularFactorial(5));

        System.out.println(sumarNumeros(5, 10, 20));
        //double[] numeros = {8.5, 7, 9.5, 10};
        //System.out.println(calcularPromedio(numeros));

        int[] vecNum = {10, 20, 30, 40, 50};
        System.out.println(buscarValor(vecNum, 10));
        System.out.println(Arrays.toString(invertirArray(vecNum)));
        imprimirArray(vecNum);

        String[] vecAlumnos = {"Juan", "Lucas", "Valentino", "Santiago"};
        double[] vecNotas = {5, 8.5, 10, 6.6};
        System.out.println(estudianteConMejorNota(vecAlumnos, vecNotas));
    }

    //Nivel 1 - Fundamentos de métodos (sin arrays):

    public static void mostrarSaludo() {
        System.out.println("Hola, mundo");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }

    public static void mostrarMenu() {
        System.out.println("===MENÚ PRINCIPAL===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Opción: ");
    }

    //Nivel 2 - Métodos con retorno y lógica:

    public static boolean esPar(int numero) {
        if (numero % 2 == 0)
            return true;
        else
            return false;
    }

    public static int calcularCuadrado(int numero) {
        return numero * numero;
    }

    public static int calcularFactorial(int numero) {
        if (numero <= 1) {
            return 1;
        }
        return numero * calcularFactorial(numero - 1);
    }

    //Nivel 3 - Métodos con varargs y arrays:

    public static int sumarNumeros(int... numeros) {
        int acumulador = 0;
        for (int i = 0; i < numeros.length; i++) {
            acumulador += numeros[i];
        }
        return acumulador;
    }

    public static double calcularPromedio(double[] numeros) {
        double acumulador = 0;
        for (int i = 0; i < numeros.length; i++) {
            acumulador += numeros[i];
        }
        return acumulador / numeros.length;
    }

    public static boolean buscarValor(int[] numeros, int numeroABuscar) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar)
                return true;
        }
        return false;
    }

    public static int contarOcurrencias (String[] palabras, String clave) {
        int contador=0;
        for (int i=0;i<palabras.length;i++) {
            if(clave.equals(palabras[i]))
                contador++;
        }
        return contador;
    }

    //Nivel 4 - Métodos combinados y más complejos:

    public static void imprimirArray(int[] numeros) {
        System.out.print("[");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);

            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static int[] invertirArray(int[] primerArray) {
        int tamanio = primerArray.length;
        int[] segundoArray = new int[tamanio];
        int j = segundoArray.length - 1;

        for (int i = 0; i < tamanio; i++) {
            segundoArray[j] = primerArray[i];
            j--;
        }
        return segundoArray;
    }

    public static String estudianteConMejorNota(String[] nombresAlumnos, double[] notas) {
        double notaMayor = notas[0];
        int indiceNotaMayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
                indiceNotaMayor = i;
            }
        }
        return nombresAlumnos[indiceNotaMayor];
    }
}