package throwable;

/*
 * Dalam Java, Throwable adalah superclass dari semua jenis kesalahan dan pengecualian (exceptions & errors). 
 * Semua exception (Exception) dan error (Error) dalam Java merupakan turunan dari Throwable.
 * 
 * Throwable adalah superclass dari semua Exception dan Error dalam Java.
 * Bisa digunakan untuk menangkap semua jenis kesalahan, tetapi lebih baik menangkap Exception secara spesifik.
 * Exception bisa ditangani dengan try-catch, sedangkan Error biasanya tidak bisa diperbaiki oleh aplikasi.
 */
public class Main {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0; // ❌ Ini akan menyebabkan ArithmeticException
        } catch (Throwable e) { // Menangkap semua jenis Throwable (Exception & Error)
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
