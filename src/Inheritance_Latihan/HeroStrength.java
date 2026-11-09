package Inheritance_Latihan;

public class HeroStrength extends Hero{
    // Varible instance
    private String type = "Strength";

    // Constrcutor 
    HeroStrength(String name, double health, double attackPower) {
        super(name, health, attackPower);
    }

    // Method display
    @Override
    public void display() {
        super.display();
        System.out.println("Type\t\t : " + this.type);
    }

    @Override
    public void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage + " --> " + 0.5 * damage);
        this.health = this.health - 0.5 * damage;
    }

}
