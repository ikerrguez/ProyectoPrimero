package ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int numero2 = teclado.nextInt();

        int resultadosuma= numero1+numero2;
        System.out.println("El resultado de la suma es: "+resultadosuma);

        int resultadoresta=  numero1-numero2;
        System.out.println("El resultado de la resta es: "+resultadoresta);

        int resultadomultiplicacion= numero1*numero2;
        System.out.println("El resultado de la multiplicación es: "+resultadomultiplicacion);

        int resultadodivision= numero1/numero2;
        System.out.println("El resultado de la división es: "+resultadodivision);

    }

}

