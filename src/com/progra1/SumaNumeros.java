package com.progra1;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0;
        boolean valido = false;
        
        // Validar primer número
        while (!valido) {
            System.out.print("Ingrese el primer número: ");
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
                valido = true;
            } else {
                System.out.println("Error: Ingrese un número válido.");
                sc.nextLine(); // Limpiar buffer
            }
        }
        
        // Validar segundo número
        valido = false;
        while (!valido) {
            System.out.print("Ingrese el segundo número: ");
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                valido = true;
            } else {
                System.out.println("Error: Ingrese un número válido.");
                sc.nextLine(); // Limpiar buffer (¡esto es clave!)
            }
        }
        
        double suma = a + b;
        System.out.println("Resultado: " + suma);
        System.out.println("¡Gracias por usar el programa!");
        sc.close();
    }
}