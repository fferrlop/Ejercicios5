package org.example;

public class Calculo {
    public static int calcularFuncion(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (n > k && k > 0) {
            return calcularFuncion(n - 1, k) + calcularFuncion(n - 1, k - 1);
        } else {
            return 0;
        }
    }
}