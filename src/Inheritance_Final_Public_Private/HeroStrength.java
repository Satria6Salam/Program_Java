package Inheritance_Final_Public_Private;

public class HeroStrength extends Hero {
    HeroStrength(String name, double health) {
        super(name, health);
        // System.out.println(this.health); // tidak bisa diakses karana private
    }

    @Override
    public String getName() {
        return this.name;
    }

    // Override getHaelt();
    // Karena disuper class public maka disub class harus public
    // @Override
    // public double getHealth() {
    //     return this.health; // tidak bisa karena this.health disuper class private
    // }

    // visibility harus sama  dengan super class
    public void display() {
        System.out.println("\nName \t:" + this.name);
        System.out.println("Health \t:" + super.getHealth());
        System.out.println("strength");
    }

    // Override final setHealth
    // tidak bisa karena final
    // void setHealth(double health) {
    //     System.out.println(health);
    // }

    // Tidak bisa
    // void setHealth(double health) {
    //     System.out.println("Coba : " + health);
    // }

    void setHealth(String health) {
        System.out.println("Coba : " + health);
    }
}
