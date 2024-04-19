package org.example;

public class SumaNumNat {
    public static int sumaNumerosNaturales(int n) {
        if (n <= 0) {
            return 0;
        } else {
            int sum = n + sumaNumerosNaturales(n - 1);
            System.out.print(sum + ", ");
            return sum;
        }
    }

    public static void main(String[] args) {

        int sum = sumaNumerosNaturales(10);

    }
}