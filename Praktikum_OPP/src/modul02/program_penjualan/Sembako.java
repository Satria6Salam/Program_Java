package modul02.program_penjualan;

public class Sembako {
    private String namaBarang;
    private int harga;
    private int stok;

    public Sembako(String namaBarang, int harga, int stok) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaBarang() {
        return this.namaBarang;
    }

    public int getHarga() {
        return this.harga;
    }

    public int getStok() {
        return this.stok;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStokKurang(int order) {
        this.stok = this.stok - order;
    }

    public void displaySembako() {
        System.out.println("Nama\t\t: " + this.namaBarang);
        System.out.println("Harga Satuan\t: Rp." + this.harga + " (Kg/L)");
        System.out.println("Stok\t\t: " + this.stok + " (Kg/L)");
    }
}