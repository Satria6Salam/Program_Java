package modul_1.Manejement_Sekolah;

public class Main {
    public static void main(String[] args) {
        Sistem_Sekolah sekolah = new Sistem_Sekolah("MAN", 123, 3);

        Siswa siswa1 = new Siswa("Badrus", "TI", 123, 1, 3);
        Siswa siswa2 = new Siswa("Satria", "TI", 125, 1, 3);
        Siswa siswa3 = new Siswa("Salam", "TI", 124, 1, 3);

        
        MataKuliah matkul1 = new MataKuliah("Matematika");
        MataKuliah matkul2 = new MataKuliah("Calculus");
        MataKuliah matkul3 = new MataKuliah("Aljabar");

        siswa1.add(matkul1, new Nilai(85));
        siswa1.add(matkul2, new Nilai(50));
        siswa1.add(matkul3, new Nilai(70));

        
        siswa2.add(matkul1, new Nilai(78));
        siswa2.add(matkul2, new Nilai(60));
        siswa2.add(matkul3, new Nilai(90));

        siswa3.add(matkul1, new Nilai(74));
        siswa3.add(matkul2, new Nilai(60));
        siswa3.add(matkul3, new Nilai(83));

        sekolah.addListSiswa(siswa1);
        sekolah.addListSiswa(siswa2);
        sekolah.addListSiswa(siswa3);

        sekolah.daftarSiswa();
        
    }
}
