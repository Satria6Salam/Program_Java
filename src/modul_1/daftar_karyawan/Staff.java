package modul_1.daftar_karyawan;

public class Staff extends Karyawan {
    private String posisi;

    public Staff(String posisi, String name, String id, double gaji) {
        super(name, id, gaji);
        this.posisi = posisi;
    }

    public String getPosisi() {
        return this.posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    
    @Override
    public void showKaryawan() {
        super.showKaryawan();
        System.out.println("Posisi  : Staff " + this.posisi);
    }
}
