package metode_readPassword;

import java.io.Console;

public class Main2 {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("Console tidak tersedia! Jalankan di terminal.");
            return;
        }

        String username = console.readLine("Masukkan username: ");
        char[] password = console.readPassword("Masukkan password: ");

        // Cek username dan password sederhana (dalam dunia nyata, gunakan hashing & database!)
        if ("admin".equals(username) && "1234".equals(new String(password))) {
            System.out.println("Login berhasil! Selamat datang, " + username);
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }
}
