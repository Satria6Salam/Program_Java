package modul_1.daftar_karyawan;

import java.util.ArrayList;

public class Perusahaan {
    private String namePeruhasaan;
    private ArrayList<Karyawan> listKaryawan = new ArrayList<>();

    public Perusahaan(String namePerusahaan) {
        this.namePeruhasaan = namePerusahaan;
    }
    public void addListKaryawan(Karyawan karyawan) {
        this.listKaryawan.add(karyawan);
    }

    public void listKaryawan() {
        System.out.println("============================================");
        System.out.println("\t\tPT " + this.namePeruhasaan);
        System.out.println("============================================");
        System.out.println("Daftar Karyawan:");
        for (Karyawan karyawan : listKaryawan) {
            karyawan.showKaryawan();
            System.out.println("--------------------------------------------");
        }

    }
}
