package latihan.pesan_tiket;

import java.util.Scanner;

// Custom Exception untuk menangani saldo tidak cukup
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Kelas Penumpang
class Penumpang2 {
    private String nama;
    private int usia;
    private double saldo;

    public Penumpang2(String nama, int usia, double saldo) {
        this.nama = nama;
        this.usia = usia;
        this.saldo = saldo;
    }

    public int getUsia() {
        return usia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void kurangiSaldo(double jumlah) {
        this.saldo -= jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Saldo: Rp " + saldo);
    }
}

// Kelas Pemesanan Tiket
class PemesananTiket2 {
    private double hargaTiket = 500000; // Harga tiket Rp 500.000

    public void pesanTiket(Penumpang2 p) throws InsufficientFundsException {
        if (p.getUsia() < 18) {
            throw new IllegalArgumentException("Usia penumpang harus minimal 18 tahun untuk membeli tiket!");
        }

        if (p.getSaldo() < hargaTiket) {
            throw new InsufficientFundsException("Saldo tidak cukup untuk membeli tiket! Dibutuhkan Rp " + hargaTiket);
        }

        p.kurangiSaldo(hargaTiket);
        System.out.println("Tiket berhasil dipesan!");
        System.out.println("Sisa saldo: Rp " + p.getSaldo());
    }
}

public class OpsiGbt {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== Pemesanan Tiket Pesawat ===");
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Usia: ");
            int usia = input.nextInt();
            System.out.print("Masukkan Saldo: Rp ");
            double saldo = input.nextDouble();

            // Membuat objek penumpang
            Penumpang2 penumpang = new Penumpang2(nama, usia, saldo);

            // Membuat objek pemesanan tiket
            PemesananTiket2 pemesanan = new PemesananTiket2();

            try {
                // Menampilkan informasi penumpang sebelum memesan tiket
                System.out.println("\n=== Informasi Penumpang ===");
                penumpang.tampilkanInfo();

                // Mencoba memesan tiket
                pemesanan.pesanTiket(penumpang);
            } catch (IllegalArgumentException e) {
                System.err.println("Kesalahan: " + e.getMessage());
            } catch (InsufficientFundsException e) {
                System.err.println("Kesalahan: " + e.getMessage());
            }
        } 
        

        System.out.println("Program Selesai.");
    }
    
}