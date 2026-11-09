package Interfacess.Interface_vs_Abstract.Hero;

public class AgilityHero extends Hero implements AttackBehaviour{
    
    public AgilityHero(String name, double health) {
        super(name, health);
    }

    public void attackBhs(Hero enemy) {
        System.out.println(this.getName() + " attacking " + enemy.getName());
    }
}
