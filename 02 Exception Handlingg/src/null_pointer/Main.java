package null_pointer;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String fileName = getFileName(); 

        // if (fileName == null) {
        //     System.out.println("Kesalahan: Nama file tidak boleh null!");
        //     return; // Menghentikan eksekusi sebelum error terjadi
        // }

        try {
            @SuppressWarnings({ "resource", "unused" })
            FileReader reader = new FileReader(fileName);
            System.out.println("File berhasil dibuka!");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }

    public static String getFileName() {
        return null; // Simulasi kesalahan logika
    }
}
