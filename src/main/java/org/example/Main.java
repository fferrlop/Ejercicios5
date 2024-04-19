package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Suma de los primeros números naturales hasta 10:");
        int max = 10;
        int sum = SumaNumNat.sumaNumerosNaturales(max);

        System.out.println("\n _______________________________________________________________________");

        System.out.println("Introduce el valor inicial del rango:");
        int a = scanner.nextInt();

        System.out.println("Introduce el valor final del rango:");
        int d = scanner.nextInt();

        RangoNumNat.imprimirRango(a, d);
    }
}