package modul02.program_penjualan;

import java.util.ArrayList;


public class Kasir {
    private ArrayList<Sembako> listProduk;
    private ArrayList<Struk> listPesanan;

    public Kasir() {
        this.listProduk = new ArrayList<>();
        this.listPesanan = new ArrayList<>();
    }

    public ArrayList<Sembako> getListProduk() {
        return this.listProduk;
    }

    public int getTotalKeseluruhan() {
        int total = 0;
        if (listPesanan.isEmpty() == false) {
            for (int i = 0; i < listPesanan.size(); i++) {
                total = total + listPesanan.get(i).getTotal();
            }
        } else {
            System.out.println("List pesanan belum ada!");
        }

        return total;
    }

    public void setTotalKeseluruhan(int totalKeseluruhan) {
        System.out.println(totalKeseluruhan);
    }

    public void addProduk(Sembako sembako) {
        this.listProduk.add(sembako);
    }

    public void addPesanan(Struk struk) {
        if (struk.getHargaSatuan() != 0 && struk.getJumlahOrder() != 0 && struk.getNamaProduk() !=null) {
            this.listPesanan.add(struk);
        }
    }

    public void listProduk() {
        System.out.println("-------------------------------------");
        System.out.println("          Informasi Produk           ");
        System.out.println("-------------------------------------");
        if (listProduk.isEmpty() == false) {
            for (int i = 0; i < listProduk.size(); i++) {
                listProduk.get(i).displaySembako();
                System.out.println("-------------------------------------");
            } 
        } else {
            System.out.println("List produk belum ada!");
        }
    }

    public void listPesanan() {
        System.out.println("-------------------------------------");
        System.out.println("           Daftar Pesanan            ");
        System.out.println("-------------------------------------");

        if (listPesanan.isEmpty() == false) {
            for (int i = 0; i < listPesanan.size(); i++) {
                listPesanan.get(i).displayStruk();
                System.out.println("-------------------------------------");
            }

            System.out.println("Total semua pesanan: Rp." + getTotalKeseluruhan());
            System.out.println("-------------------------------------");
        } else {
            System.out.println("List pesanan belum ada!");
        }
        
    }
}
