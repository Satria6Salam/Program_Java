package metode_readLine;

import java.io.Console;

public class Main2 {
    public static void main(String[] args) {
        Console console = System.console();

        // Pastikan console tidak null (harus dijalankan di terminal)
        if (console == null) {
            System.out.println("Console tidak tersedia! Jalankan program ini di terminal.");
            return;
        }

        // Menggunakan readLine dengan format teks
        String nama = console.readLine("Masukkan nama Anda: ");
        int umur = Integer.parseInt(console.readLine("Masukkan umur Anda (%s): ", "hanya angka"));

        System.out.printf("\nHalo, %s! Anda berusia %d tahun.\n", nama, umur);
    }
}
