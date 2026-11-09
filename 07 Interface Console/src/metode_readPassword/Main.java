package metode_readPassword;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console tidak tersedia");
            return;
        }

        char[] password = console.readPassword("Masukkan passwaod: ");

        // Menampilkan panjang password tanpa menampilkan karater aslinya
        System.out.println("Password diterima, panjang: " + password.length + " karakter.");
        System.out.print("Password: ");
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
    }
}
