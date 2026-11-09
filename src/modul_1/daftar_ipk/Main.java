package modul_1.daftar_ipk;

public class Main {
    public static void main(String[] args) {
        Mahasiswa siswa1 = new Mahasiswa("Satria", "Urek-Urek", "240");
        Mahasiswa siswa2 = new Mahasiswa("Novika","Abdur Rahma Saleh","241");

        Ipk ipk1 = new Ipk(3.8);
        Ipk ipk2 = new Ipk(4);


        siswa1.equipIpk(ipk1);
        siswa2.equipIpk(ipk2);

        siswa1.display();
        siswa2.display();

    }
}
