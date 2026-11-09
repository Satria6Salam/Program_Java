package Interfacess.Interface_vs_Abstract.Hero;

public class IntelHero extends Hero implements AttackBehaviour,SpellBehaviour {
    
    public IntelHero(String name, double health) {
        super(name, health);
    }

    public void attackBhs(Hero enemy) {
        System.out.println(this.getName() + " attacking " + enemy.getName());
    }

    public void spellBhs(Hero enemy) {
        System.out.println(this.getName() + " magic " + enemy.getName());
    }
}
