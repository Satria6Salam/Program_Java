package Inheritance_Latihan;

public class Hero {
    // Varible instance
    protected String name;
    public double health;
    private double attackPower;

    // Constructor
    Hero(String name, double health, double attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("\nName Hero\t : " + this.name);
        System.out.println("Health\t\t : " + this.health);
        System.out.println("Attack Power\t : " + this.attackPower);
    }

    // Method attack
    public void attack(Hero enemy) {
        System.out.println("\n" + this.name + " attacking " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }
    
    // Method take damage
    public void takeDamage(double damage) {
        System.out.println(this.name + " receive damage " + damage);
        this.health = this.health - damage;
    }

}
