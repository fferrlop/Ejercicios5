package org.example;

public class SumaNumNat {
    public static int sumaNumerosNaturales(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumaNumerosNaturales(n - 1);
        }
    }

    public static void main(String[] args) {
        int sum = sumaNumerosNaturales(10);
        System.out.println("La suma de los primeros 10 números naturales es: " + sum);
    }
}
