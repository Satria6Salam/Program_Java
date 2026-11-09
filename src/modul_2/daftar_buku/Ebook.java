package modul_2.daftar_buku;

public class Ebook extends Buku {
    private String format;

    public Ebook(String judul, String penulis, String penerbit, int tahunTerbit, String format) {
        super(judul, penulis, penerbit, tahunTerbit);
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Format\t\t: " + this.format);
    }
}
