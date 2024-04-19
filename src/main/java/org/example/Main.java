package org.example;

import FuncionesRecursivas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("1. Suma de los primeros números naturales hasta 10");

        System.out.println("Suma de los primeros números naturales hasta 10:");
        int max = 10;
        int sum = SumaNumNat.sumaNumerosNaturales(max);

    System.out.println("\n _______________________________________________________________________");

    System.out.println("2. Rango de números naturales");

        System.out.println("Introduce el valor inicial del rango:");
        int a = scanner.nextInt();

        System.out.println("Introduce el valor final del rango: ");
        int d = scanner.nextInt();

        RangoNumNat.imprimirRango(a, d);

    System.out.println("\n _______________________________________________________________________");

    System.out.println("3. Contador de dígitos");

        System.out.println("Introduce un número para contar sus dígitos:");
        int num = scanner.nextInt();
        int digitCount = DigitosNumNat.contarDigitos(num);
        System.out.println("El número " + num + " tiene " + digitCount + " dígitos.");

    System.out.println("\n _______________________________________________________________________");

    System.out.println("4. Potencia de un número");

        System.out.println("Introduce la base y el exponente para calcular la potencia:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = MultiplicacionRecu.potencia(x, y);
        System.out.println(x + " elevado a " + y + " es igual a " + result);

    System.out.println("\n _______________________________________________________________________");

    System.out.println("5. Encontrar el valor máximo de un vector");

        System.out.println("Introduce el tamaño del vector:");
        int size = scanner.nextInt();
        int[] vector = new int[size];
        System.out.println("Introduce los elementos del vector:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }
        int maximo = MaxVector.maximoVector(vector, 0, size - 1);
        System.out.println("El valor máximo del vector es: " + maximo);


    System.out.println("\n _______________________________________________________________________");

    System.out.println("6. Convertir un número hexadecimal a decimal");

        System.out.println("Introduce una cadena de dígitos hexadecimales:");
        String hex = scanner.next();
        int decimal = DigitosHexa.hexToDecimal(hex, hex.length());
        System.out.println("El valor decimal de la cadena hexadecimal " + hex + " es: " + decimal);


    System.out.println("\n _______________________________________________________________________");

    System.out.println("7. C (n,k)= C (n-1,k) + C (n-1,k-1) si n>k>0");

        System.out.println("Introduce los valores de n y k para calcular C(n, k):");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int resultado = Calculo.calcularFuncion(n, k);
        System.out.println("C(" + n + ", " + k + ") es igual a " + result);

        scanner.close();
    }
}