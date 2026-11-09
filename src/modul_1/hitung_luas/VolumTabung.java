package modul_1.hitung_luas;

// Make class Banguntabung
class VolumTabung {
    private double jariJari;
    private double tinggi;
    private double phi;

    // Constructor
    public VolumTabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.phi = 3.14;
    }

    // Method getter
    public double getJariJari() {
        return this.jariJari;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public double getLuas() {
        return this.phi * this.jariJari * this.tinggi;
    }

    // Method setter
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Method displayLuas
    public void display() {
        System.out.println("====================================");
        System.out.println("Jari-jari\t: " + this.jariJari + " CM");
        System.out.println("Tinggi\t\t: " + this.tinggi + " CM");
        System.out.println("Phi\t\t: " + this.phi);
        System.out.printf("Luas Tabung : %1$.2f * %2$.2f * %3$.2f = %4$.2f CM³", this.phi, this.jariJari, this.tinggi, this.getLuas());
        System.out.println("\n====================================");
    }
}


