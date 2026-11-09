package latihan.pesan_tiket;

public class Penumpang {
    private String nama;
    private int usia;
    private double saldo;

    public Penumpang(String nama, int usia, double saldo) {
        this.nama = nama;
        this.usia = usia;
        this.saldo = saldo;
    }

    public int getUsia() {
        return this.usia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void kurangSaldo(double hargaTiket) {
        this.saldo -= hargaTiket;
    }

    public void display() {
        System.out.println("\nIDENTITAS PENUMPANG");
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Usia\t: " + this.usia);
        System.out.println("Saldo\t: " + this.saldo);
    }
}
