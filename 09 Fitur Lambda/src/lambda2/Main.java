/*
 * Lambda dengan Banyak Parameter
 * Jika ada lebih dari satu parameter, gunakan tanda kurung.
 */
package lambda2;

interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Lambda untuk penjumlahan
        MathOperation add = (a, b) -> a + b;

        // Lambda untuk perkalian
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Penjumlahan: " + add.operate(5, 3));
        System.out.println("Perkalian: " + multiply.operate(5, 3));
    }
}
