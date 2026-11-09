package modul_1.perpustakaan2;

import java.util.ArrayList;

public class Siswa {
    private String name;
    private String kelas;
    private int nim;
    private boolean statusPinjam;
    private ArrayList<Buku> bukuPinjam = new ArrayList<>();

    public Siswa(String name, String kelas, int nim) {
        this.name = name;
        this.kelas = kelas;
        this.nim = nim;
    }

    public void addBukuPinjam(Buku buku) {
        this.bukuPinjam.add(buku);
    }
    
    public void removeBuku(Buku buku) {
        this.bukuPinjam.remove(buku);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setStatusPinjam(boolean statusPinjam) {
        this.statusPinjam = statusPinjam;
    }
 
    public String getName() {
        return this.name;
    }

    public String getKelas() {
        return this.kelas;
    }

    public int getNim() {
        return this.nim;
    }

    public boolean getStatusPinjam() {
        return this.statusPinjam;
    }

    public String getStatusPinjam2() {
        if (this.statusPinjam == false) {
            return "Tidak meminjam buku";
        } else {
            return "Meminjam buku";
        }
    }

    public ArrayList<Buku> getListBukuPinjam() {
        return bukuPinjam;
    }

    public void displayBukuPinjam() {
        for (Buku buku : bukuPinjam) {
            buku.displayBuku();
        }
    }

    public void displaySiswa() {
        System.out.println();
        System.out.println("Name\t: " + this.name);
        System.out.println("Kelas\t: " + this.kelas); 
        System.out.println("NIM\t: " + this.nim);
        System.out.println("Status\t: " + this.getStatusPinjam2());
    }
}
