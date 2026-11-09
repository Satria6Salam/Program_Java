package modul_1.perpustakaan;

public class Buku {
    private String judulBuku;
    private String pengarang;
    private int tahunTerbit;
    private boolean statusBuku;
    private static int jumlahBuku = 0;
    private Siswa siswa;

    public Buku(String judulBuku, String pengarang, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.statusBuku = true;
        Buku.jumlahBuku++;
    }

    public void bukuDikembalikan(Siswa siswa) {
        this.siswa = siswa;
        this.statusBuku = true;
    }

    public void bukuDipinjam (Siswa siswa) {
        this.siswa = siswa;
        this.statusBuku = false;
    }

    public String getStatus() {
        if (this.statusBuku == true) {
            return "Buku tersedia";
        } else if (this.statusBuku == false){
            return "Buku dipinjam";
        } else {
            return "Buku tidak ada";
        }
    }

    public static int getJumlahBuku() {
        return Buku.jumlahBuku;
    }

    public void displayBuku() {
        System.out.println("==============================================================");
        System.out.println("Judul\t\t" + "Pengarang\t" + "Tahun Terbit\t" + "Status");
        System.out.println(this.judulBuku + "\t" + this.pengarang + "\t\t" + this.tahunTerbit + "\t\t" + this.getStatus());
    }

    public void display() {
        this.siswa.display();
        System.out.println("========================================");
        System.out.println("Judul buku\t\t: " + this.judulBuku);
        System.out.println("Pengarang\t\t: " + this.pengarang);
        System.out.println("Tahun terbit\t\t: " + this.tahunTerbit );
        System.out.println("Status Buku\t\t: " + this.getStatus());
    }
}
