package modul_1.Manejement_Sekolah;

public class MataKuliah {
    private String mataKuliah;

    public MataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getMatkul() {
        return this.mataKuliah;
    }

    public void setNamaMatkul(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }


    public void showMapelNilai () {
        System.out.println(this.getMatkul());
    }
}
