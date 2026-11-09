package Modul10.ProgramModul;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContohException2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b1, b2, hasil;
        try {
            System.out.print("Bilangan 1: ");
            b1 = in.nextInt();
            System.out.print("Bilangan 2: ");
            b2 = in.nextInt();
            hasil = b1 / b2;
            in.close();
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Error Pembagian dengan 0");
        } catch (InputMismatchException e) {
            System.out.println("Data yang Anda Masukkan Bukan Angka");
        }

        System.out.println("Program ditutup Normal");

    }
}
