package FuncionesRecursivas;

import java.util.Scanner;

public class RangoNumNat {
    public static int sumaNumerosNaturales(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumaNumerosNaturales(n - 1);
        }
    }

    public static void imprimirRango(int a, int d) {
        for (int i = a; i <= d; i++) {
            int sum = sumaNumerosNaturales(i);
            if (i == d) {
                System.out.println(sum);
            } else {
                System.out.print(sum + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor inicial del rango:");
        int a = scanner.nextInt();

        System.out.println("Introduce el valor final del rango:");
        int d = scanner.nextInt();

        imprimirRango(a, d);
    }
}