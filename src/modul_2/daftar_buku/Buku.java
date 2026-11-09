package modul_2.daftar_buku;

public class Buku {
    private String judul;
    private String penulis;
    private String penerbit;
    private int tahunTerbit;

    public Buku(String judul, String penulis, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public String getPenerbit() {
        return this.penerbit;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void display() {
        System.out.println("\nJudul\t\t: " + this.judul);
        System.out.println("Penulis\t\t: " + this.penerbit);
        System.out.println("Penerbit\t: " + this.penerbit);
        System.out.println("Tahun terbit\t: " + this.tahunTerbit);
    }
}
