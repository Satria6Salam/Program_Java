package modul_1.daftar_pembelian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Daftar_Transaksi kasir = new Daftar_Transaksi("Agra Rahaya");
        boolean pilih = true;
        String[] opsi = {"Menambah Produk", "Daftar Transaksi", "Keluar"};


        do {
            System.out.println("==================================================");
            System.out.println("             TOKO " + kasir.getNameToko());
            System.out.println("==================================================");
            int inputOpsi;
            for (int i = 0; i < opsi.length; i++) {
                System.out.println((i + 1)+ ". " + opsi[i]);
            }
            System.out.println("--------------------------------------------------");
            System.out.print  ("Pilih angka(1-3): ");
            inputOpsi = input.nextInt();

            if (inputOpsi == 1) {
                System.out.print("Masukkan jumlah produk yang ingin ditambah: ");
                int jumlah = input.nextInt();

                for (int i = 0; i < jumlah; i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.print("Nama Produk : ");
                    String inputProduk = input.nextLine();
                    System.out.print("Harga Produk: ");
                    double inputHarga = input.nextDouble();
                    System.out.print("Jumlah yang akan dibeli: ");
                    int jumlahBeli = input.nextInt();

                    Produk produk = new Produk(inputProduk, inputHarga);
                    Transaksi transaksi = new Transaksi(produk, jumlahBeli);
                    kasir.addList(transaksi);
                }
            } else if (inputOpsi == 2) {
                kasir.daftarTransaksi();
            } else if (inputOpsi == 3){
                pilih = false;
            } 
        } while (pilih == true);

        kasir.daftarTransaksi();
        input.close();
    }
}
