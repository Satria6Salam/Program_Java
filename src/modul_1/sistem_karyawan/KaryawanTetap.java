package modul_1.sistem_karyawan;

public class KaryawanTetap extends Karyawan {
    private double tunjangan;
    private static int jumlahKaryawanTetap = 0;

    public KaryawanTetap(String name, int nik, double gajiPokok, double tunjangan) {
        super(name, nik, gajiPokok);
        this.tunjangan = tunjangan;
        KaryawanTetap.jumlahKaryawanTetap++;
    }

    @Override
    public double getGaji() {
        return super.getGaji() + this.getTunjangan();
    }

    public static int getJumlahKaryawanTetap() {
        return KaryawanTetap.jumlahKaryawanTetap;
    }

    public double getTunjangan() {
        return this.tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public void showKaryawan() {
        System.out.println("---------------------------------------");
        super.showKaryawan();
        System.out.println("Tunjangan\t: " + this.getTunjangan());
        System.out.println("Total gaji\t: " + this.getGaji());
    }
}
