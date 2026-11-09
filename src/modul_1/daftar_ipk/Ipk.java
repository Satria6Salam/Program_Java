package modul_1.daftar_ipk;

public class Ipk {
    private double ipk;

    // Constructor
    public Ipk(double ipk) {
        this.ipk = ipk;
    }

    // Method getter
    public String getPredikat() {
        if (this.ipk > 2 && this.ipk <= 2.75) {
            return "Memuaskan";
        } else if (this.ipk > 2.75 && this.ipk <= 3.5) {
            return "Sangat Memuaskan";
        } else if (this.ipk > 3.5 && this.ipk <= 4.0) {
            return "Dengan Pujian";
        } else if (this.ipk >= 0 && this.ipk < 2) {
            return "Jeblok";
        } else if (this.ipk < 0) {
            return "Ipk tidak boleh nol dan negatif";
        } else {
            return "Ipk Tidak ada";
        }
    }

    public Double getIpk() {
        return this.ipk;
    }
}

