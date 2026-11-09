package modul_1.hitung_luas;

public class LuasTrapesium {
    private double panjangAlas;
    private double panjangAtas;
    private double tinggi;

    public LuasTrapesium(double panjangAlas, double panjangAtas, double tinggi) {
        this.panjangAlas = panjangAlas;
        this.panjangAtas = panjangAtas;
        this.tinggi = tinggi;
    }

    // Method getter
    public double getPanjangALas() {
        return this.panjangAlas;
    }

    public double getPanjangAtas() {
        return this.panjangAtas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public double getLuas() {
        return  ((this.panjangAtas + this.panjangAlas) * 0.5) * this.tinggi;
    }
    
    // Method setter
    public void setPanjangAlas(double panjangAlas) {
        this.panjangAlas = panjangAlas;
    }

    public void setPanjangAtas(double panjangAtas) {
        this.panjangAtas = panjangAtas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Methos display
    public void display() {
        System.out.println("====================================");
        System.out.println("Panjang alas\t: " + this.panjangAlas + " CM");
        System.out.println("Panjang atas\t: " + this.panjangAtas + " CM");
        System.out.println("Tinggi\t\t: " + this.tinggi + " CM");
        System.out.printf("Luas trapesium : ((%1$.2f + %2$.2f) * 0.5) * %3$.2f ) = %4$.2f CM²", this.panjangAlas, this.panjangAtas, this.tinggi, this.getLuas());
        System.out.println("\n====================================");
    }
}
