package modul_1.sistem_karyawan;

public class Karyawan {
    private String name;
    private int nik;
    private double gajiPokok;

    public Karyawan(String name, int nik, double gajiPokok) {
        this.name = name;
        this.nik = nik;
        this.gajiPokok = gajiPokok;
    }

    public String getName() {
        return this.name;
    }

    public int getNik() {
        return this.nik;
    }

    public double getGaji() {
        return this.gajiPokok;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void showKaryawan() {
        System.out.println("Nama\t\t: " + this.getName());
        System.out.println("NIK\t\t: " + this.getNik());
        System.out.println("Gaji Pokok\t: " + this.gajiPokok);
    }
}
