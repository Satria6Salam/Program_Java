package Modul10.Tugas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        Toko toko = new Toko();

        String IDKode, namaBarang;
        int harga, stok;
        int opsi = 0;
        boolean next = true;
        boolean inOpsi = false;
        boolean bolID = false;
        boolean bolStok = false;
        boolean bolHarga = false;

        while (next == true) {
            toko.in();
            do {
                try {
                    System.out.print  ("Pilih : ");
                    opsi = Integer.parseInt(input.readLine());
                    inOpsi = true;
                } catch (NumberFormatException e) {
                    System.out.println("\nERROR!!!\n" + e.getMessage() + "\nInput harus berupa angka!!!");
                } 
            } while (inOpsi == false);
          

            switch (opsi) {
                case 1:
                    ATK atk = new ATK();

                    System.out.println("===================================================");
                    System.out.print("Masukkan Nama Barang: ");
                    namaBarang = input.readLine();
                    atk.setNamaBarang(namaBarang);

                    do {
                        try {
                            System.out.print("Masukkan ID Barang: ");
                            IDKode = input.readLine();
                            atk.setIDKode(IDKode);
                            bolID = true;
                        } catch (KodeErrorException e) {
                            System.out.println("\nERROR!!!" + e.getMessage());
                            System.out.println();
                        }
                    } while (bolID == false);

                    do {
                        try {
                            System.out.print("Masukkan Harga Barang: ");
                            harga = Integer.parseInt(input.readLine());
                            atk.setHarga(harga);
                            bolHarga = true;
                        } catch (PriceLimitException e) {
                            System.out.println("\nERROR!!!" + e.getMessage());
                            System.out.println();
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR!!!\n" + e.getMessage() + "\nInput harus berupa angka!!!");
                            System.out.println();
                        }
                    } while (bolHarga == false);
                    
                    do {
                        try {
                            System.out.print("Masukkan Stok Barang: ");
                            stok = Integer.parseInt(input.readLine());
                            atk.setStok(stok);
                            bolStok = true;
                        } catch (StokExceedCapacityException e) {
                            System.out.println("\nERROR!!!" + e.getMessage());
                            System.out.println();
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR!!!\n" + e.getMessage() + "\nInput harus berupa angka!!!");
                            System.out.println();
                        }
                    } while (bolStok == false);

                    toko.addATK(atk);

                    namaBarang = null;
                    IDKode = null;
                    harga = 0;
                    stok = 0;
                    bolID = false;
                    bolStok = false;
                    bolHarga = false;
                    break;
                case 2:
                    Makanan makanan = new Makanan();

                    System.out.println("===================================================");
                    System.out.print("Masukkan Nama Barang: ");
                    namaBarang = input.readLine();
                    makanan.setNamaBarang(namaBarang);

                    do {
                        try {
                            System.out.print("Masukkan ID Barang: ");
                            IDKode = input.readLine();
                            makanan.setIDKode(IDKode);
                            bolID = true;
                        } catch (KodeErrorException e) {
                            System.out.println("\nERROR!!!" + e.getMessage());
                            System.out.println();
                        }
                    } while (bolID == false);

                    do {
                        try {
                            System.out.print("Masukkan Harga Barang: ");
                            harga = Integer.parseInt(input.readLine());
                            makanan.setHarga(harga);
                            bolHarga = true;
                        } catch (PriceLimitException e) {
                            System.out.println("\nERROR!!!" + e.getMessage());
                            System.out.println();
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR!!!\n" + e.getMessage() + "\nInput harus berupa angka!!!");
                            System.out.println();
                        }
                    } while (bolHarga == false);
                    
                    do {
                        try {
                            System.out.print("Masukkan Stok Barang: ");
                            stok = Integer.parseInt(input.readLine());
                            makanan.setStok(stok);
                            bolStok = true;
                        } catch (StokExceedCapacityException e) {
                            System.out.println("\nERROR!!!" + e.getMessage());
                            System.out.println();
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR!!!\n" + e.getMessage() + "\nInput harus berupa angka!!!");
                            System.out.println();
                        }
                    } while (bolStok == false);

                    toko.addMakanan(makanan);

                    namaBarang = null;
                    IDKode = null;
                    harga = 0;
                    stok = 0;
                    bolID = false;
                    bolStok = false;
                    bolHarga = false;
                    break;
                case 3:
                    toko.daftarBarangATK();
                    break;
                case 4:
                    toko.daftarBarangMakanan();
                    break;
                case 5:
                    toko.out();
                    next = false;
                    break;
            }
        }
    }
}
