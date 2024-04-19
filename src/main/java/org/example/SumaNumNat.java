package org.example;

public class SumaNumNat {
    public static int sumaNumerosNaturales(int n, int max) {
        if (n <= 0) {
            return 0;
        } else {
            int sum = n + sumaNumerosNaturales(n - 1, max);
            if (n == max) {
                System.out.print(sum);
            } else {
                System.out.print(sum + ", ");
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int max = 10;
        int sum = sumaNumerosNaturales(max, max);
        System.out.println("\nLa suma de los primeros " + max + " números naturales es: " + sum);
    }
}