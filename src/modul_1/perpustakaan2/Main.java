package modul_1.perpustakaan2;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan1 = new Perpustakaan("Cahaya Permata");

        Buku buku1 = new Buku("Pantun", "Sulistiowati", 2014);
        Buku buku2 = new Buku("Puisi", "Indrawan", 2001);
        Buku buku3 = new Buku("Pelengkap Cinta", "Ramadan", 2015);
        Buku buku4 = new Buku("Surga Ilahi", "Utsd Zainal",1997);
        Buku buku5 = new Buku("Pandawa", "Subroto", 1986);

        Siswa siswa1 = new Siswa("Satria", "12 A", 2005);
        Siswa siswa2 = new Siswa("Rizqi", "12 G", 1007);
        Siswa siswa3 = new Siswa("Doni", "11 B", 2300);

        perpustakaan1.addBuku(buku1);
        perpustakaan1.addBuku(buku2);
        perpustakaan1.addBuku(buku3);
        perpustakaan1.addBuku(buku4);
        perpustakaan1.addBuku(buku5);

        perpustakaan1.addSiswa(siswa1);
        perpustakaan1.addSiswa(siswa2);
        perpustakaan1.addSiswa(siswa3);

        // perpustakaan1.daftarBuku();
        // perpustakaan1.daftarSiswa();

        perpustakaan1.pinjamBuku("Satria", "Pantun");
        perpustakaan1.pinjamBuku("Rizqi", "Pandawa");
        perpustakaan1.pinjamBuku("Satria", "Surga Ilahi");
        perpustakaan1.daftarPinjam();
        perpustakaan1.mengembalikanBuku("Satria", "Pantun");
        perpustakaan1.mengembalikanBuku("Satria", "Surga Ilahi");
        perpustakaan1.daftarPinjam();
        perpustakaan1.daftarSiswa();

        // perpustakaan1.daftarPinjam();
        // perpustakaan1.daftarBuku();
        // perpustakaan1.daftarSiswa();
    }
}
