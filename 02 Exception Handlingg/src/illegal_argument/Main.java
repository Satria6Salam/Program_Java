package illegal_argument;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(factorial(5));  // ✅ Output: 120
            System.out.println(factorial(-3)); // ❌ Akan memunculkan IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
            e.printStackTrace(); // lebih detail karena menunjukkan baris kode yang menyebabkan error.
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Angka harus >= 0"); // Jika argumen tidak valid
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
