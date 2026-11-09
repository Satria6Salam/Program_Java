package modul_1.daftar_pembelian;

public class Transaksi {
    private Produk produk;
    private int jumlahProduk;
    private double totalHarga;

    public Transaksi(Produk produk, int jumlahProduk) {
        this.produk = produk;
        this.jumlahProduk = jumlahProduk;
        this.totalHarga = produk.getHarga() * jumlahProduk;
    }

    public Produk getProduk() {
        return this.produk;
    }

    public int getJumlahProduk() {
        return this.jumlahProduk;
    }

    public double getTotalHarga() {
        return this.totalHarga;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public void setJumlahProduk(int jumlahProduk) {
        this.jumlahProduk = jumlahProduk;
    }

    public void showTransaksi() {
        this.produk.showProduk();
        System.out.println("Jumlah\t: " + this.jumlahProduk);
        System.out.println("Total\t: Rp. " + this.getTotalHarga());
    }

}
