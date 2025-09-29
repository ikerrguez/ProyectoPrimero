package ejercicio6;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Programa iniciado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String nombreUsuario = sc.nextLine();
        if (nombreUsuario.equals("admin")) {
            System.out.println("Bienvenido admin");
        }else{
            System.out.println("Acceso prohibido");
        }
    }

}
