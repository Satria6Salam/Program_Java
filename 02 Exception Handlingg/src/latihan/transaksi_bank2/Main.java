package latihan.transaksi_bank2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("======================================================================");
        System.out.println("                               Bank BCA                               ");
        System.out.println("======================================================================");
        System.out.println("WARNING !!!");
        System.out.println("1. No Rekening harus 5 digit!");
        System.out.println("2. Saldo awal minimal Rp. 100.000");
        System.out.println("3. Input Tidak boleh negatif! & Tidak Boleh '0'");
        System.out.println("4. Saldo anda boleh diambil setengah dari simpanan Saldo sekarang!");
        System.out.println("======================================================================");
        System.out.println("---                                                                ---");
        System.out.println("-----                                                            -----");
        System.out.println("------                                                          ------");
        System.out.print  ("No Rekening : ");
        String no = input.nextLine();
        System.out.print  ("Nama Pemilik: ");
        String nama = input.nextLine();
        double saldo = cekType(input, "Saldo Awal  : ");

        RekeningBank bank = new RekeningBank(no, nama, saldo);
        bank.validasiNo();
        bank.validasiSaldo();
        bank.informasiRekening();
        bank.deposit();
        bank.tarikSaldo();
        bank.informasiRekening();

        
        
    }

    private static double cekType(Scanner input, String message) {
        double angka = 0;
        while (true) {
            try {
                System.out.print(message);
                angka = input.nextDouble();
                return angka;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak boleh bertype String");
                input.nextLine();
            }
        }
    }

    public static String getValidString(Scanner input) {
        String teks;
        while (true) {
            System.out.print("Masukkan nama (hanya huruf): ");
            teks = input.nextLine();
            if (teks.matches("[a-zA-Z ]+")) { // Hanya huruf dan spasi
                break;
            }
            System.out.println("Input salah! Nama hanya boleh berisi huruf.");
        }
        return teks;
    }

    public static String getValidNoRekening(Scanner input) {
        String noRek;
        while (true) {
            System.out.print("Masukkan nomor rekening (5 digit): ");
            noRek = input.nextLine();
            if (noRek.matches("\\d{5}")) { // Harus angka dan tepat 5 digit
                break;
            }
            System.out.println("Input salah! Nomor rekening harus 5 digit angka.");
        }
        return noRek;
    }
    
}
