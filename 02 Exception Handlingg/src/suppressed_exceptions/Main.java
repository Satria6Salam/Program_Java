package suppressed_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath1 = "filePath1.txt";
        String filePath2 = "filePath2.txt"; // file yang tidak ada
        // String filePath3 = "filePath3.txt"; 

        try (
            BufferedReader baca1 = new BufferedReader(new FileReader(filePath1));
            BufferedReader baca3 = new BufferedReader(new FileReader(filePath2))
        ) {
            // Membaca file pertama
            String line;
            while ((line = baca3.readLine()) != null ||
                   (line = baca1.readLine()) != null) {
                System.out.println(line);
            }

            // throw new IOException("Pengecualian");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());

            // Throwable[] suppressed = e.getSuppressed();
            // for (Throwable t : suppressed) {
            //     System.err.println("Pengecualian yang di suppressed: " + t.getMessage());
            // }
        }

        System.out.println("Akhir");
    }
}
