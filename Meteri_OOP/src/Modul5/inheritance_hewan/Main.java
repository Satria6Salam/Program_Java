package Modul5.inheritance_hewan;

public class Main {
    public static void main(String[] args) {
        Sapi  perah = new Sapi();
        Kucing tom = new Kucing("Kucing", 4);

        System.out.println("Suara Sapi Perah");
        perah.bersuara();
        
        tom.bersuara();
    }
}
