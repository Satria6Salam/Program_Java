package Modul5.inheritance_alpha;

public class Echo extends Alpha {
    private int c = 9;

    @Override
    public void info() {
        super.info();
        System.out.println("c = " + c);
    }
}
