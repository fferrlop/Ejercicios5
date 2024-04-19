package FuncionesRecursivas;

public class MaxVector {
    public static int maximoVector(int[] vector, int inicio, int fin) {
        if (inicio == fin) {
            return vector[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int max1 = maximoVector(vector, inicio, mitad);
            int max2 = maximoVector(vector, mitad + 1, fin);
            return Math.max(max1, max2);
        }
    }
}