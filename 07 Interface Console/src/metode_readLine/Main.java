package metode_readLine;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        // Pastikan program dijalankan di terminal (bukan di IDE seperti Eclipse/IntelliJ)

        if (console == null) {
            System.out.println("Concole tidak tersedia");
            return;
        }

        String nama = console.readLine("Masukkan nama anda: ");
        System.out.println("Halooo...! " + nama);
    }
}
