package Method;

class Mahasiswa2 {
    // Properti varible instance
    String nama;
    int NIM;

    // Constructor 
    Mahasiswa2(String nama, int NIM) {
        this.nama = nama;
        this.NIM = NIM;
        //method.test();
    }
    
    // Method tanpa return dan parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // Methods tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }
    void setNIM(int NIM) {
        this.NIM = NIM;
    }

    // Method return tanpa parameter 
    String getNama() {
        return this.nama;
    }
    int getNIM() {
        return this.NIM;
    }

    // Method return dengan parameter
    String retNama(String message) {
        return message + ", Salam kenal, nama saya " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa2 siswa = new Mahasiswa2("Satria", 120);
        // System.out.println(siswa.nama);
        // System.out.println(siswa.NIM);

        System.out.println("========> Method tanpa return & parameter");
        siswa.show();

        System.out.println("========> Method tanpa return dg parameter");
        siswa.setNama("Rizki");
        siswa.setNIM(333);
        siswa.show();

        System.out.println("========> Method return tanpa parameter");
        System.out.println(siswa.getNama());
        System.out.println(siswa.getNIM());

        System.out.println("========> Method return dengan parameter");
        String nama = siswa.retNama("Hallo");
        System.out.println(nama);  
    }

    static void test(){
        System.out.println(">> Method test");
    }
}
