package ejercicio5;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
    System.out.println("Iniciando el programa");
    System.out.println("Introduce un precio");
    Scanner sc = new Scanner(System.in);
    double precio= sc.nextDouble();
    if (precio>=100){
        double precioRebajado = precio - precio*0.15; //declaración de la variable
        System.out.println("El precio rebajado es: "+precioRebajado);
    }else {
        System.out.println("El precio es de: "+precio);
    }



    }
}
