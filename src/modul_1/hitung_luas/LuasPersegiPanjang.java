package modul_1.hitung_luas;

public class LuasPersegiPanjang {
    private double tinggi;
    private double lebar;

    // Constructor
    public LuasPersegiPanjang(double tinggi, double lebar) {
        this.tinggi = tinggi;
        this.lebar = lebar;
    }

    // Method getter
    public double getTinggi() {
        return this.tinggi;
    }

    public double getLebar() {
        return this.lebar;
    }

    public double getLuas() {
        return this.tinggi * this.lebar;
    }

    // Method setter
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Methos display 
    public void display() {
        System.out.println("====================================");
        System.out.println("Tinggi\t: " + this.tinggi + " CM");
        System.out.println("Lebar\t: " + this.lebar + " CM");
        System.out.printf("Luas persegi panjang : %1$.2f * %2$.2f = %3$.2f CM²", this.tinggi, this.lebar, this.getLuas());
        System.out.println("\n====================================");
    }
}