package modul_1.daftar_karyawan;

public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan1 = new Perusahaan("Agra Winata");

        Manajer manajer1 = new Manajer("Produksi", "Satria", "12098", 5000000);
        Manajer manajer2 = new Manajer("Pemasaran", "Iwan", "60218", 3000000);
        Manajer manajer3 = new Manajer("Pengemasan", "Doni", "34308", 3500000);
        Manajer manajer4 = new Manajer("Penjualan", "Awal", "20097", 2000000);

        Staff staff1 = new Staff("Admin", "Bambang", "20993", 3800000);
        Staff staff2 = new Staff("Marketing", "Susilo", "74388", 3500000);
        Staff staff3 = new Staff("Keuangan", "Yudo", "10076", 4500000);

        perusahaan1.addListKaryawan(manajer1);
        perusahaan1.addListKaryawan(manajer2);
        perusahaan1.addListKaryawan(manajer3);
        perusahaan1.addListKaryawan(manajer4);
        perusahaan1.addListKaryawan(staff1);
        perusahaan1.addListKaryawan(staff2);
        perusahaan1.addListKaryawan(staff3);

        perusahaan1.listKaryawan();

    }
}
