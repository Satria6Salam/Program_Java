package modul_1.daftar_ipk;

public class Mahasiswa {
    private String name;
    private String alamat;
    private String nim;
    private Ipk ipk;

    // Constructor
    public Mahasiswa(String name, String alamat, String nim) {
        this.name = name;
        this.alamat = alamat;
        this.nim = nim;
    }

    // Method setter
    public void equipIpk(Ipk ipk) {
        this.ipk = ipk;
    }

    // Method display
    public void display() {
        System.out.println("======================================");
        System.out.println("              MAHASISWA               ");
        System.out.println("======================================");
        System.out.println("Nama\t: " + this.name);
        System.out.println("NIM\t: " + this.nim);
        System.out.println("Alamat\t: " + this.alamat);
        System.out.println("IPK\t: " + ipk.getIpk() + " ( "+this.ipk.getPredikat() + " )");
    }
}
