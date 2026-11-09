package metode_readPassword;

import java.io.Console;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Console console = System.console();

        // Pastikan console tidak null (hanya bisa dijalankan di terminal)
        if (console == null) {
            System.out.println("Console tidak tersedia! Jalankan program ini di terminal.");
            return;
        }

        // Menggunakan readPassword dengan format teks
        char[] password = console.readPassword("Masukkan password (%s): ", "tersembunyi");

        // Konversi password ke String untuk ditampilkan (jangan lakukan ini dalam aplikasi nyata)
        String passwordStr = new String(password);
        System.out.println("\nPassword yang dimasukkan (hanya untuk demo): " + passwordStr);

        // Hapus password dari memori setelah digunakan (praktik keamanan yang baik)
        Arrays.fill(password, ' ');
    }
}
