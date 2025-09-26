package ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenidos a mi calculadora de triángulos!");
        //declaración variable
        int base;
        //asignación de un valor a una variable
        System.out.println("Ingrese el numero base (entero): ");
        base = sc.nextInt();
        //podemos hacer declaración y asignación en una línea
        System.out.println("Ingrese el numero altura (entero): ");
        int altura = sc.nextInt();
        //como hay una división, declaramos el resultado como decimal
        double area = (double) (base+altura)/2;
        System.out.println("El área del triángulo es: "+area);

    }
}
