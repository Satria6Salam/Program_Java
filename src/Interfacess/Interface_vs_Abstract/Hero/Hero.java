package Interfacess.Interface_vs_Abstract.Hero;

public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
    }

    public void display() {
        System.out.println("Hero\t: " + this.name);
        System.out.println("Health\t: " + this.health);
    }
}
