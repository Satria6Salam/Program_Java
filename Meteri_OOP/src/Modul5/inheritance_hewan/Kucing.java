package Modul5.inheritance_hewan;

public class Kucing extends Hewan {
    Kucing(String jenis, int kaki) {
        super(jenis,kaki);
    }

    public void bersuara() {
        super.bersuara();
        System.out.println("Miaowwww....");
    }
}
