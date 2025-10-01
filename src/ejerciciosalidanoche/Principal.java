package ejerciciosalidanoche;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Vamos a tomar el aire. Bienvenido");
        double nivelAlcohol = 0.0;
        double precioChupito = 3;
        double precioCanha = 1.8;
        double precioCombinado = 8;
        double nivelChupito = 0.25;
        double nivelCanha = 0.1;
        double nivelCombinado = 0.4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre ");
        String nombreCliente = sc.nextLine();
        System.out.println("Ingrese la edad ");
        int edadCliente = sc.nextInt();
        System.out.println("Ingrese el dinero del cliente ");
        double dineroCliente = sc.nextDouble();
        System.out.println("El cliente de nombre: " + nombreCliente + " con edad " + edadCliente + " años, tiene " + dineroCliente + " euros ");
        System.out.println("¡BIENVENIDO A PELÍCANO!");
        if (edadCliente >= 18) {
            System.out.println("El portero comprueba tu estado");
            if (nivelAlcohol >= 1.2) {
                System.out.println("No entras, vas muy borracho");
            } else {
                System.out.println("Pase usted");
                System.out.println("El cliente va a beber una canha");
                if (dineroCliente >= precioCanha) {
                    System.out.println("El cliente va a beber una canha");
                    nivelAlcohol = nivelAlcohol + nivelCanha;
                    dineroCliente = dineroCliente - precioCanha;
                    System.out.println("El cliente solicita beber un chupito");
                    if (dineroCliente >= precioChupito) {
                        System.out.println("El cliente bebe un chupito");
                        nivelAlcohol = nivelAlcohol + nivelChupito;
                        dineroCliente = dineroCliente - precioChupito;
                    }
                }else 
                    System.out.println("No tienes dinero suficiente para consumir");
            }

        } else {
            System.out.println("Acceso denegado");
        }
    }}




