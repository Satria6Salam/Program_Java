package Interfacess.Hero;

public class Hero implements AttackBehaviour {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // Memaksa class Hero untuk mengimplemenstasikan method attack()
    public void attack(Hero enemy) {
        System.out.println(this.name + " attacking " + enemy.name);
    }

    public void display() {
        System.out.println("Haro\t: " + this.name);
        System.out.println("Health\t: " + this.health);
    }
}
