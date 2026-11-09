package modul_1.daftar_karyawan;

public class Karyawan {
    private String name;
    private String id;
    private double gaji;

    public Karyawan(String name, String id, double gaji) {
        this.name = name;
        this.id = id;
        this.gaji = gaji;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public double getGaji() {
        return this.gaji;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void showKaryawan() {
        System.out.println("Name\t: " + this.name);
        System.out.println("Id\t: " + this.id);
        System.out.println("Gaji\t: Rp. " + this.gaji);
    }
}
