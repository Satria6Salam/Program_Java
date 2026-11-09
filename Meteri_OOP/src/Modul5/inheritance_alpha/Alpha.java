package Modul5.inheritance_alpha;

public class Alpha {
    private int a = 5;
    protected int b = 7;
    
    public void info() {
        System.out.println("Dipanggil pada" + this.getClass().getName());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
