package modul_1.perpustakaan2;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private boolean statusBuku;
    
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.statusBuku = true;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setStatusBuku(boolean statusBuku) {
        this.statusBuku = statusBuku;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public boolean getStatusBuku() {
        return this.statusBuku;
    }

    public String getStatusBuku2() {
        if (this.statusBuku == true) {
            return "Buku tersedia";
        } else if (this.statusBuku == false) {
            return "Buku di pinjam";
        } else {
            return "Buku tidak ada";
        }
    }

    public void displayBuku() {
        System.out.println();
        System.out.println("Judul\t\t: " + this.judul);
        System.out.println("Pengarang\t: " + this.pengarang);
        System.out.println("Tahun\t\t: " + this.tahunTerbit);
        System.out.println("Status Buku\t: " + this.getStatusBuku2());
    }
}
