package modul_2.daftar_nilai;

public class Main {
    public static void main(String[] args) {
        DaftarSiswa daftar = new DaftarSiswa();

        Siswa siswa1 = new Siswa("Satria", "240605110201", "Sains dan Teknologi", "Teknik Informatika");
        siswa1.addCalculus(new Calculus(80, 0, 75, 79));
        siswa1.addOpp(new OPP(75, 76, 81, 85));
        siswa1.addAljabar(new Aljabar(80, 93, 87, 77));

        daftar.addSiswa(siswa1);
        daftar.daftarSiswa();
        


        
    }
}
