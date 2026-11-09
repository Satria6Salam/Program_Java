package modul_1.perpustakaan2;

import java.util.ArrayList;

public class Perpustakaan {
    private String namePerpustakaan;
    private static int jumlahBuku;
    private static int jumlahSiswa;
    private ArrayList<Buku> listBuku = new ArrayList<>();
    private ArrayList<Siswa> listSiswa = new ArrayList<>(); 


    public Perpustakaan(String namePerpustakaan) {
        this.namePerpustakaan = namePerpustakaan;
    }

    public void addBuku(Buku buku) {
        this.listBuku.add(buku);
        Perpustakaan.jumlahBuku++;    
    }

    public void addSiswa(Siswa siswa) {
        this.listSiswa.add(siswa);
        Perpustakaan.jumlahSiswa++;
    }

    public void pinjamBuku(String name, String judul) {
        for (Buku buku : listBuku) {
            if (buku.getJudul().equals(judul)){
                if (buku.getStatusBuku() == true) {
                    buku.setStatusBuku(false);
                    for (Siswa siswa : listSiswa) {
                        if (siswa.getName().equals(name)) {
                            siswa.addBukuPinjam(buku);
                            siswa.setStatusPinjam(true);
                        }   
                    }
                } else if (buku.getStatusBuku() != true) {
                    System.out.println("Buku sudah dipinjam");
                } else {
                    System.out.println("Buku tidak ada");
                }
            } 
        }
    }

    public void mengembalikanBuku(String name, String judul) {
        for (Buku buku : listBuku) {
            if (buku.getJudul().equals(judul)){
                if (buku.getStatusBuku() == false) {
                    buku.setStatusBuku(true);
                    for (Siswa siswa : listSiswa) {
                        if (siswa.getName().equals(name)) {
                            siswa.removeBuku(buku);
                            if (siswa.getListBukuPinjam().isEmpty()) {
                                siswa.setStatusPinjam(false);
                            }   
                        }   
                    }
                } 
            } 
        }
    }

    public void daftarPinjam() {
        System.out.println("==============================================================");
        System.out.println(  "   Daftar Peminjaman di Perpustakaan " + this.namePerpustakaan );
        System.out.println("==============================================================");
        for (Siswa siswa : listSiswa) {
            if (siswa.getStatusPinjam() == true) {
                siswa.displaySiswa();
                System.out.println("Buku yang dipinjam: ");
                siswa.displayBukuPinjam();
            }
        }
    }

    public void daftarSiswa() {
        System.out.println();
        System.out.println("==============================================================");
        System.out.println(  "     Daftar Siswa di Perpustakaan " + this.namePerpustakaan    );
        System.out.println("==============================================================");

        for (Siswa siswa : listSiswa) {
            siswa.displaySiswa();
        }
        System.out.println();
        System.out.println(  "Total\t: " + Perpustakaan.jumlahSiswa + " Siswa");
        System.out.println("==============================================================");
    }

    public void daftarBuku() {
        System.out.println();
        System.out.println("==============================================================");
        System.out.println(  "     Daftar Buku di Perpustakaan " + this.namePerpustakaan     );
        System.out.println("==============================================================");

        for (Buku buku : listBuku) {
            buku.displayBuku();
        }
        System.out.println();
        System.out.println(  "Total\t: " + Perpustakaan.jumlahBuku + " Buku");
        System.out.println("==============================================================");
    }
}
