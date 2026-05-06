import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //---------EJERCICIOS FOR---------

        // 1) imprimir los números del 1 al 10.
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }


        // 2) imprimir los numeros pares del 0 al 50.
//        for (int i = 0; i < 51; i++) {
//            if(i%2==0)
//                System.out.println(i);
//        }

        // 3) Sumar los numeros del 1 al 100 e imprimir el resultado.
//        int suma = 0;
//        for (int i = 1; i < 101; i++) {
//            suma+=i;
//        }
//        System.out.println(suma);

        //---------EJERCICIOS WHILE---------

        // 1) imprimir en cuenta regresiva de 5 hasta 1 y ¡Despuegue!
//        int cuenta=5;
//        while(cuenta>0){
//            System.out.println(cuenta);
//            cuenta--;
//        }
//        System.out.println("¡Despuegue!");


        // 2) Validación de contraseña: pedir al usuario una contraseña y verificar que sea correcta.
//        String contraseñaCorrecta="0123";
//        System.out.print("Ingrese su contraseña: ");
//        String contraseñaUsuario=sc.nextLine();
//        while(!contraseñaUsuario.equals(contraseñaCorrecta)){
//            System.out.println("Error: contraseña incorrecta.");
//            System.out.print("Ingrese nuevamente su contraseña: ");
//            contraseñaUsuario=sc.nextLine();
//        }
//        System.out.println("Contraseña correcta!");


        //3) adivinar un número: detener el ciclo cuando el numero ingresado sea igual al condicional.
//        int numeroCorrecto=5;
//        System.out.print("Ingrese un número: ");
//        int numeroUsuario=sc.nextInt();
//        while(numeroUsuario!=numeroCorrecto){
//            System.out.print("Incorrecto, vuelva a ingresar el número: ");
//            numeroUsuario=sc.nextInt();
//        }
//        System.out.println("Correcto, haz acertado el número!");

        //---------EJERCICIOS DO-WHILE---------
        //1) Menú Simple: Imprime un menú de opciones al menos una vez, y luego pregunta si el usuario quiere verlo de nuevo.
        // El bucle continúa si el usuario lo desea.

//        String respuesta;
//        do{
//            System.out.println("===== MENÚ =====");
//            System.out.println("1. Ver productos");
//            System.out.println("2. Agregar producto");
//            System.out.println("3. Salir");
//            System.out.println("================");
//
//            System.out.print("¿Deseas ver el menú nuevamente? SI/NO: ");
//            respuesta=sc.nextLine().toLowerCase();
//        }while(respuesta.equals("si"));


        //2) Solicitar Número Positivo: Pide al usuario que ingrese un número,
        // y sigue pidiéndolo hasta que ingrese un número positivo.

//        int numero;
//        do {
//            System.out.print("Ingrese un número: ");
//            numero=sc.nextInt();
//        }while(numero<=0);
//
//        System.out.println("Número positivo ingresado: "+numero);


        //3) Contador Mínimo: Imprime números del 1 al 3. Asegura que al menos el 1 se imprima,
        // incluso si la condición del while se cumple desde el principio.

//        int contador=1;
//        do {
//            System.out.println(contador);
//            contador++;
//        }while(contador<=3);


        //---------EJERCICIO MIXTO---------
        // -Tablas de Multiplicar (del 1 al 5): Usa un bucle externo (for) para iterar por las tablas del 1 al 5,
        // y un bucle interno (for, while o do-while) para calcular e imprimir cada multiplicación (del 1 al 10).

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("==== TABLA DEL " + i + " ====");
//
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//        }

    }
}