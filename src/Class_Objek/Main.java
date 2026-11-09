package Class_Objek;

// membuat class 
class MahaSiswa {
    String nama;
    int nim;
    String jurusan;
    int umur;
    double ipk;
}

public class Main {
    public static void main(String[] args) {
        // intansiasi / membuat objek
        MahaSiswa mhSiswa1 = new MahaSiswa();

        mhSiswa1.nama = "Satria";
        mhSiswa1.nim  = 12345;
        mhSiswa1.jurusan = "Teknik Informatika";
        mhSiswa1.umur = 19;
        mhSiswa1.ipk  = 3.82;
        
        System.out.println(mhSiswa1.nama);
        System.out.println(mhSiswa1.nim);
        System.out.println(mhSiswa1.jurusan);
        System.out.println(mhSiswa1.umur);
        System.out.println(mhSiswa1.ipk);

        MahaSiswa mhSiswa2 = new MahaSiswa();

        mhSiswa2.nama = "Badrus";
        mhSiswa2.nim  = 8765;
        mhSiswa2.jurusan = "Teknik Informatika";
        mhSiswa2.umur = 19;
        mhSiswa2.ipk  = 4.0;
        
        System.out.println(mhSiswa2.nama);
        System.out.println(mhSiswa2.nim);
        System.out.println(mhSiswa2.jurusan);
        System.out.println(mhSiswa2.umur);
        System.out.println(mhSiswa2.ipk);



    }
}
