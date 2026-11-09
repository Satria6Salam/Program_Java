package try_catch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        System.out.println("1. Metode try-catch");
        try {
            // Mencoba mengakses elemen yang tidak ada
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangani pengecualian
            System.out.println("Terjadi pengecualian: " + e.getMessage()); //e.getMessage() = metode yang digunakan untuk mengambil pesan error (message) dari sebuah exception (pengecualian).
        }

        System.out.println("2. Metode throwing exception");
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Usia harus 18 tahun atau lebih."); // IllegalArgumentException = Jika argumen tidak valid, misalnya angka negatif untuk usia.
        }
    }
    
}
