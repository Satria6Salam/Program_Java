package modul_1.sistem_karyawan;

public class KaryawanHarian extends Karyawan {
    private int jamKerja;
    private double tarifPerjam;
    private static int jumlahKaryawanHarian = 0;

    public KaryawanHarian(String name, int nik, double gajiPokok, int jamKerja, double tarifPerjam) {
        super(name, nik, gajiPokok);
        this.jamKerja = jamKerja;
        this.tarifPerjam = tarifPerjam;
        KaryawanHarian.jumlahKaryawanHarian++;
    }

    @Override
    public double getGaji() {
        return super.getGaji() + (this.getJamKerja() * this.getTarifPerjam());
    }

    public static int getJumlahKaryawanHarian() {
        return KaryawanHarian.jumlahKaryawanHarian;
    }

    public int getJamKerja() {
        return this.jamKerja;
    }

    public double getTarifPerjam() {
        return this.tarifPerjam;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setTarifPerjam(double tarifPerjam) {
        this.tarifPerjam = tarifPerjam;
    }

    @Override
    public void showKaryawan() {
        System.out.println("---------------------------------------");
        super.showKaryawan();
        System.out.println("Jam kerja\t: " + this.getJamKerja());
        System.out.println("Tarif perjam\t: " + this.getTarifPerjam());
        System.out.println("Total gaji\t: " + this.getGaji());
    }
}
