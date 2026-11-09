package try_catch;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
// import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "filePath1.txt";
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pembagi: ");
        int bagi;

        try {
            bagi = input.nextInt();
            try (BufferedReader baca = new BufferedReader(new FileReader(filePath))) {
                String line;
                int lineNumber = 1;
                while ((line = baca.readLine()) != null) {
                    try {
                        // Konversi string ke integer
                        int number = Integer.parseInt(line);

                        // pembagian angka 
                        int result = number / bagi;
                        System.out.println("Hasil bagi baris " + lineNumber + ": " + result);
                    } catch (NumberFormatException e){
                        System.out.println("Kesalahan format angka di baris " + lineNumber + ": " + line);
                    } catch (ArithmeticException e) {
                        System.out.println("Kesalahan pembagian di baris " + lineNumber + ": Pembagian dengan nol tidak boleh");
                    }
                    lineNumber++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Kesalahan saat membaca file: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan bilangan bulat");
        } finally {
            input.close();
        }
    }
}
