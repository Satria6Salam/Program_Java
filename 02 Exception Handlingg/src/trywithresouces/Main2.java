package trywithresouces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Harus ditutup secara manual
                    System.out.println("Berhasil menutup resource");
                }
            } catch (IOException e) {
                System.out.println("Gagal menutup resource: " + e.getMessage());
            }
        }
    }
}
