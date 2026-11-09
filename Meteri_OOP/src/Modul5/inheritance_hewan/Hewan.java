package Modul5.inheritance_hewan;

public class Hewan {
    private String  jenis;
    private int kaki;

    Hewan() {}

    Hewan(String jenis, int kaki) {
        this.jenis = jenis;
        this.kaki = kaki;
    }

    public void bersuara() {
        System.out.println("Suara hewan " + jenis + " berkaki " + kaki);
    }
}
