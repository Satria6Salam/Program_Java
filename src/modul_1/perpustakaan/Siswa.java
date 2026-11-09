package modul_1.perpustakaan;

public class Siswa {
    private String nama;
    private int kelas;
    private static int jumlahSiswa;

    public Siswa(String nama, int kelas) {
        this.nama = nama;
        this.kelas = kelas;
        Siswa.jumlahSiswa++;
    }

    public static int jumlahPeminjaman() {
        return jumlahSiswa;
    }

    public void display() {
        System.out.println("\n========================================");
        System.out.println("Nama Siswa\t: " + this.nama);
        System.out.println("Kelas\t\t: " + this.kelas);
    }
}
