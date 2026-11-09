package modul02.program_penjualan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Kasir kasir = new Kasir();

        String[] menu = {
            "1. Masukkan Produk",
            "2. Tampilkan Daftar Produk",
            "3. Order Produk",
            "4. Tampilkan Daftar Pesanan",
            "5. Keluar dari program"
        };
        boolean next = true;
        int ang;
        while (next == true) {
            System.out.println("=====================================");
            System.out.println("        TOKO SEMBAKO ADI CIPTO       ");
            System.out.println("=====================================");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i]);
            }
             
            System.out.print("Pilih menu: ");
            ang = Integer.parseInt(input.readLine());
            switch (ang) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.print("Nama Produk: ");
                    String namaProduk = input.readLine();
                    System.out.print("Harga Satuan (Kg/L): Rp.");
                    int hargaSatuan = Integer.parseInt(input.readLine());
                    System.out.print("Stok: ");
                    int stok = Integer.parseInt(input.readLine());
                    
                    Sembako sembako = new Sembako(namaProduk, hargaSatuan, stok);
                    kasir.addProduk(sembako);
                    break;
                case 2:
                    kasir.listProduk();
                    break;
                case 3: 
                    System.out.println("-------------------------------------");
                    Struk struk = new Struk();
                    struk.addProduk(kasir);
                    struk.order();
                    kasir.addPesanan(struk);
                    break;
                case 4: 
                    kasir.listPesanan();
                    break;
                case 5: 
                    System.out.println("=====================================");
                    System.out.println("            Program Selesai          ");
                    System.out.println("=====================================");
                    next = false;
                    break;
            }
        }

    }
}
