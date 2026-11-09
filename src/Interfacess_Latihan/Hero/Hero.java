package Interfacess_Latihan.Hero;

public abstract class Hero {
    private String name;
    private double health;
    private AttackSkillBehaviour attackSkill;
    
    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public void setAttackSkill(AttackSkillBehaviour attackSkill) {
        this.attackSkill = attackSkill;
    }

    public void attack(Hero enemy) {
        System.out.println(this.name + " is attacking ");
        this.attackSkill.attack(enemy);
    }

    public void display() {
        System.out.println("Hero\t: " + this.name);
        System.out.println("Health\t: " + this.health);
    }
}
