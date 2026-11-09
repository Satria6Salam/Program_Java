package Static.ClassAttribute;

/*
 *  1. Static variabel / class variable : menaruh attribut atau varibanle nempel ke class
 */

 class Display {
    private String name;
    public static String type = "Hardware";

    Display(String name) {
        this.name = name;
    }

    public void setType(String inputType) {
        // type = inputType; Alternatif 1
        // this.type = inputType; Alternatif 2
        Display.type = inputType; // Alternatif 3
    }

    public void show() {
        System.out.println("Name\t: " + this.name);
    }
 }
public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        Display display2 = new Display("Printer");

        display1.show();
        display2.show();

        display1.setType("Shoftware");

        System.out.println("\nMenampilkan static atau class variable");
        System.out.println("========================================");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

    }
    
}
