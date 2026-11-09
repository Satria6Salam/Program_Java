package modul_1.hitung_lingkaran;

public class Lingkaran {
    private double jariJari;
    private double phi = 3.14;
    private static int jumlahLingkaran = 0;
    
    // Constructor
    public Lingkaran() {
        this.jariJari = 0;
        Lingkaran.jumlahLingkaran++;
    }

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        Lingkaran.jumlahLingkaran++;
    }

    // Method setter
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Methos getter
    public double getJariJari() {
        return this.jariJari;
    }
    public double getLuas() {
        return this.phi * this.jariJari * this.jariJari;
    }

    public double getKeliling() {
        return 2 * this.phi * this.jariJari;
    }

    public static int getJumlahLingkaran() {
        return Lingkaran.jumlahLingkaran;
    }
}
