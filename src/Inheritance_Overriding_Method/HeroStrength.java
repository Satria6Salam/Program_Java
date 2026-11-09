package Inheritance_Overriding_Method;

public class HeroStrength extends Hero{
    double defense;

    // Overriding mehtod
    void display() {
        System.out.println("\n>>>>>> Overriding Method");
        System.out.println("Name\t\t : " + this.name);
        System.out.println("Defense Power\t : " + this.defense);
    }
}
