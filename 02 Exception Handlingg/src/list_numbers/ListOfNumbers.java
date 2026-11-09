package list_numbers;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListOfNumbers {
    private ArrayList<Integer> numbers;
    private static final int ukuran = 10;

    public ListOfNumbers() {
        this.numbers = new ArrayList<>();
        // input ArrayList dengan angka 0-9
        for (int i = 0; i < ukuran; i++) {
            this.numbers.add(i);
        }
    }

    // Method untuk menulis daftar angka ke dalam file
    public void writeList() {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter("OutFile.txt"))) {
            for (Integer number : numbers) {
                writer.write(number.toString()); // konversi int ke string
                writer.newLine(); // Menambah baris baru 
            }
            System.out.println("Daftar telah ditulis ke OutFile.txt");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }
}
