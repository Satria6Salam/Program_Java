package modul_1.sistem_karyawan;

public class ManajemenKaryawan {
    private Karyawan[] listKaryawan;
    private String namePerusahaan;
    private int jumlahKarywan;
    private int kapasitas;

    ManajemenKaryawan(String namePerusahaan, int kapasitas) {
        this.namePerusahaan = namePerusahaan;
        this.kapasitas = kapasitas;
        this.listKaryawan = new Karyawan[kapasitas];
        this.jumlahKarywan = 0;
    }

    public String getNamePerusahhan() {
        return this.namePerusahaan;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public int getJumlahKaryawan() {
        return this.jumlahKarywan;
    }

    public void setNamePerusahaan(String namePerusahaan) {
        this.namePerusahaan = namePerusahaan;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setJumlahKarayawan(int jumlahKaryawan) {
        this.jumlahKarywan = jumlahKaryawan;
    }

    public double getTotalGaji() {
        double totalSemuaGaji = 0;
        for (int i = 0; i < listKaryawan.length; i++) {
            totalSemuaGaji += this.listKaryawan[i].getGaji();
        }
        return totalSemuaGaji;
    }

    public void addKaryawan(Karyawan karyawan) {
        if (jumlahKarywan < listKaryawan.length) {
            this.listKaryawan[jumlahKarywan] = karyawan;
            this.jumlahKarywan++;
        } else {
            System.out.println("Kapasitas sudah penuh");
        }           
    }

    public void displayKaryawan() {
        System.out.println("===================================================");
        System.out.println("\t\tPT. " + this.getNamePerusahhan());
        System.out.println("===================================================");
        System.out.println("Daftar seluruh karyawan");
        for (int i = 0; i < listKaryawan.length; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Name\t: " + this.listKaryawan[i].getName());
            System.out.println("NIK\t: " + this.listKaryawan[i].getNik());
            System.out.println("Gaji\t: " + this.listKaryawan[i].getGaji());
        }
    }
}
