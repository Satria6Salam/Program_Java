package trywithresouces;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        // Menggunakan try-with-resources untuk membaca file
        String file = "example.txt";

        try (BufferedReader baca = new BufferedReader(new FileReader(file))) {
            String line;
            // Membaca file baris per baris
            while ((line = baca.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
