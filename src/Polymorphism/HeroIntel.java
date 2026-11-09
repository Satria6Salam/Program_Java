package Polymorphism;

public class HeroIntel extends Hero {
    // Variable instance
    private String type = "Hero Intel";

    // Constuctor 
    HeroIntel(String name) {
        super(name);
    }

    // Method display
    @Override
    public void display() {
        System.out.println();
        super.display();
        System.out.println("Type \t: " + this.type);
    }

    public void showOff() {
        System.out.println("Saya hero intel");
    }
}
