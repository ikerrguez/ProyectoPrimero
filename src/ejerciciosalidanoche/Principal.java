package ejerciciosalidanoche;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Vamos a tomar el aire. Bienvenido");
        double nivelAlcohol= 0.0;
        double precioChupito= 3;
        double precioCaña= 1.8;
        double precioCombinado= 8;
        double nivelChupito= 0.25;
        double nivelCaña= 0.1;
        double nivelCombinado= 0.4;
        System.out.println("Dime tu nombre");
        Scanner sc = new Scanner(System.in);
        String nombreCliente=sc.nextLine();
        System.out.println("Dime tu edad");
        int edadCliente=sc.nextInt();
        System.out.println("Dime cuánto dinero tienes");
        int dineroCliente=sc.nextInt();
        System.out.println(nombreCliente + " tiene " + edadCliente + " años y " + dineroCliente+ " euros ");
        System.out.println("Buenas noches. Si quieres entrar en la discoteca debes ser mayor de edad.");

         int edadPermitida= 18;
        if (edadCliente<edadPermitida) {
            System.out.println("No puedes entrar en la discoetca");
        }else{
            System.out.println("Tienes el paso permitido a la discoteca");
        }

        System.out.println("¿Qué te gustaría beber?");
        


    }
}
