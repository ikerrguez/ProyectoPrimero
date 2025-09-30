package ejercicio7;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Programa iniciado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor decimal entre 0 y 10");
        double nota = sc.nextDouble();
        if (!(nota >= 0 && nota <= 10)) {
            System.out.println("La nota debe estar entre 0 y 10");
        } else {
            if (nota < 5) {
                System.out.println("Estás suspenso");
            } else if (nota < 6) {
                System.out.println("Estás aprobado");
            } else if (nota < 7) {
                System.out.println("Tienes un bien");
            } else if (nota < 8) {
                System.out.println("Tienes un notable");
            } else if (nota < 9) {
                System.out.println("Tienes un notable");
            } else if (nota < 10) {
                System.out.println("Tienes un sobresaliente");
            } else if (nota <= 10) {
                System.out.println("Tienes un sobresaliente");
            }
        }

    }}