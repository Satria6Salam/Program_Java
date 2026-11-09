package modul_1.daftar_pembelian;

import java.util.ArrayList;

public class Daftar_Transaksi {
    private String name;
    private ArrayList<Transaksi> listTransaksi;

    public Daftar_Transaksi(String name) {
        this.name = name;
        this.listTransaksi = new ArrayList<>();
    }

    public String getNameToko() {
        return this.name;
    }

    public ArrayList<Transaksi> getListTransaksi() {
        return listTransaksi;
    }

    public void addList(Transaksi transaksi) {
        this.listTransaksi.add(transaksi);
    }

    public void setNameToko(String name) {
        this.name = name;
    }

    public void daftarTransaksi() {
        System.out.println("==================================================");
        System.out.println("\t\tToko " + this.name);
        System.out.println("==================================================");
        System.out.println("Daftar transaksi: ");
        for (Transaksi transaksi : listTransaksi) {
            transaksi.showTransaksi();
            System.out.println("--------------------------------------------------");
        }

    }
}
