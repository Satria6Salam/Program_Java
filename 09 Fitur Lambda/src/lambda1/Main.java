/*
 * Lambda dengan Satu Parameter (Tanpa Kurung)
 * Jika hanya ada satu parameter, tanda kurung bisa dihilangkan.
 */
package lambda1;

interface Printer {
    void print(String message);
}

public class Main {
    public static void main(String[] args) {
        // Implementasi lambda
        Printer printer = message -> System.out.println("Pesan: " + message);
        printer.print("Halo dunia");
    }
}
