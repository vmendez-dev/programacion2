import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Nivel 1:

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
        System.out.print("Opción: ");
    }

    //Nivel 2:

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

    public static void main(String[] args) {
        System.out.println(calcularFactorial(5));
    }
}