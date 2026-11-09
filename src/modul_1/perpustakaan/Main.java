package modul_1.perpustakaan;



public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pancasila", "Satria", 2014);
        Buku buku2 = new Buku("Bahasa Arab", "Somad", 2000);
        Buku buku3 = new Buku("Matematika", "Said", 2021);
        Buku buku4 = new Buku("Kalkulus", "Jefri", 2013);
        Buku buku5 = new Buku("Disktrit", "Salam", 2024);

        buku1.displayBuku();
        buku2.displayBuku();
        buku3.displayBuku();
        buku4.displayBuku();
        buku5.displayBuku();
        
        Siswa nama1 = new Siswa("Badrus", 12);
        Siswa nama2 = new Siswa("Ali", 12);
        Siswa nama3 = new Siswa("Doni", 12);

        buku1.bukuDipinjam(nama1);
        buku2.bukuDipinjam(nama3);
        buku5.bukuDipinjam(nama2);

        buku1.display();
        buku2.display();
        buku5.display();
        
        System.out.println();
        buku1.displayBuku();
        buku2.displayBuku();
        buku3.displayBuku();
        buku4.displayBuku();
        buku5.displayBuku();

        buku1.bukuDikembalikan(nama1);
        buku5.bukuDikembalikan(nama2);

        System.out.println();
        buku1.displayBuku();
        buku2.displayBuku();
        buku3.displayBuku();
        buku4.displayBuku();
        buku5.displayBuku();
    }
}
