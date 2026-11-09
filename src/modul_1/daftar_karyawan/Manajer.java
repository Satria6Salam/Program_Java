package modul_1.daftar_karyawan;

public class Manajer extends Karyawan {
    private String departemen;

    public Manajer(String departemen, String name, String id, double gaji) {
        super(name, id, gaji);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return this.departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public void showKaryawan() {
        super.showKaryawan();
        System.out.println("Departemen: Manajer " + this.departemen);
    } 
}
