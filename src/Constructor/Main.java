package Constructor;

class Mahasiswa1 {
    // Variabel intance
    String name;
    int NIM;

    // Constructor
    Mahasiswa1 (String name, int NIM) {
        this.name = name;
        this.NIM = NIM;
    }
    
    // Method display
    void display () {
        System.out.println("Name : " + this.name);
        System.out.println("NIM  : " + this.NIM);
    }
}
public class Main {
    public static void main(String[] args) {
        // Assignment membuat objek 
        Mahasiswa1 siswa1 = new Mahasiswa1("Satria", 1200);
        siswa1.display();
    }
}
