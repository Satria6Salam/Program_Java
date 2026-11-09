package modul_1.daftar_pembelian;

public class Produk {
    private String name;
    private double harga;

    public Produk(String produk, double harga) {
        this.name = produk;
        this.harga = harga;
    }

    public String getName() {
        return this.name;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void showProduk() {
        System.out.println("Produk\t: " + this.getName());
        System.out.println("Harga\t: Rp. " + this.harga);
    }
}
