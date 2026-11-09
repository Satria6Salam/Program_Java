package metode_printf;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console tidak tersedia");
            return;
        } else {
            String nama = console.readLine("Masukkan nama: ");
            int umur = Integer.parseInt(console.readLine("Masukkan umur: "));

            console.printf("Nama Anda: %s\n", nama);
            console.printf("Umur Anda: %d tahun\n", umur);
            // console.format("Terima kasih, %s! Anda berusia %d tahun.\n", nama, umur); contoh console.format
        }
    }
}
