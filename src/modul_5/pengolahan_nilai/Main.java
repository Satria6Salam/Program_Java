package modul_5.pengolahan_nilai;

public class Main {
    public static void main(String[] args) {
        Sekolahan sekolahan1 = new Sekolahan();

        Siswa siswa1 = new Siswa(); 
        Siswa siswa2 = new Siswa(); 
        Siswa siswa3 = new Siswa(); 
    
        double[][] list1 = {
            {70, 78, 80, 67},
            {78, 88, 70, 98},
            {89, 77, 72, 78},
        };

        double[][] list2 = {
            {70, 78, 70, 77},
            {68, 78, 70, 98},
            {69, 77, 92, 78},
        };

        double[][] list3 = {
            {70, 78, 90, 67},
            {78, 68, 70, 58},
            {89, 77, 92, 78},
        };

        siswa1.setNama("Satria Badrus Salam");
        siswa1.setId("238988");
        siswa1.setKelas("B");
        siswa1.setNilai(list1);
        siswa1.setRataRata();
        siswa1.setTotalNilai();
   
        siswa2.setNama("Wawan Hendra");
        siswa2.setId("238870");
        siswa2.setKelas("B");
        siswa2.setNilai(list2);
        siswa2.setRataRata();
        siswa2.setTotalNilai();

        siswa3.setNama("Toni Sulistio");
        siswa3.setId("238742");
        siswa3.setKelas("B");
        siswa3.setNilai(list3);
        siswa3.setRataRata();
        siswa3.setTotalNilai();

        sekolahan1.setListSiswa(siswa1);
        sekolahan1.setListSiswa(siswa2);
        sekolahan1.setListSiswa(siswa3);

        // System.out.println(sekolahan1.getSiswa().length);
        // System.out.println(sekolahan1.getSiswa()[0]);
        // System.out.println(sekolahan1.getSiswa()[1]);
        // System.out.println(sekolahan1.getSiswa()[2]);
        // System.out.println(sekolahan1.getSiswa()[3]);

        sekolahan1.daftarPeringkat();
        
        
        
       
    }
}
