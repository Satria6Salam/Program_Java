package Polymorphism;

public class HeroAgility extends Hero {
    // Variable instance
    private String type = "Hero Agility";

    // Constructor
    HeroAgility(String name) {
        super(name);
    }

    // Method display
    @Override
    public void display() {
        System.out.println();
        super.display();
        System.out.println("Type \t: " + this.type);
    }
    
}
