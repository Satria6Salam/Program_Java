package exception_throw;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        int[] angka = {1,2,3};
        int indek;
        int hasil = 0;
        
        System.out.println("======Exception throws by method======");
        System.out.print  ("Masukkan Indek Ke-");
        indek = input.nextInt();
        try {
            hasil = data(angka, indek);
        } catch (Exception exception_message) {
            System.err.println(exception_message);
        }
       
        System.out.printf ("Hasil Indek Ke %d adalah %d \n", indek, hasil);
        System.out.println("Akhhir Program");
    }
    
    private static int data(int[] dataArray, int indek) throws IOException {
        int hasil;
        hasil = dataArray[indek];
        return hasil;
    }
}
