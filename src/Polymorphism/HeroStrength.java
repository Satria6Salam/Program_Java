package Polymorphism;

public class HeroStrength extends Hero {
    // Variable instance
    private String type = "Hero Strength";

    // Constructor
    HeroStrength(String name) {
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
        System.out.println("Saya hero strength");
    }
}
