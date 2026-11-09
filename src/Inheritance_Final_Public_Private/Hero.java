package Inheritance_Final_Public_Private;

public class Hero {
    public String name;
    private double health;
    
    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }
    
    // Method getter
    public double getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    // Method setter
    final void setHealth(double health) {
        this.health = health;
    }

    // Overloading (can)
    void setHealth(String mode) {
        if (mode.equals("reset")) {
            this.health = 10;
        }
    }

    public void display() {
        System.out.println("Hero \t:" + this.name);
        System.out.println("Health \t:" + this.health);

    }
}
