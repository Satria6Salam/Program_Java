package Reflection.Method_Constructor.Hero;

public abstract class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("Hero\t: " + this.name + " health (" + this.health + ")");
    }
}
