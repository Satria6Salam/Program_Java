package Polymorphism;

public class Hero {
    // Variable instance
    private String name;

    // Constructor
    Hero(String name) {
        this.name = name;
    }

    // Method display
    public void display() {
        System.out.println();
        System.out.println("Name \t: " + this.name);
    }

    public void attack(Hero enemy) {
        System.out.println(this.name + " Menyerang " + enemy.name);
    }


}
