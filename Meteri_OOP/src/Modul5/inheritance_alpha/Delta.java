package Modul5.inheritance_alpha;

public class Delta extends Alpha {
    private int c = 9;
    
    @Override
    public void info() {
        System.out.println("Dipanggil pada " + this.getClass().getName());
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
