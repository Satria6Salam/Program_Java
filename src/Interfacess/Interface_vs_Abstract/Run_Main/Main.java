package Interfacess.Interface_vs_Abstract.Run_Main;

import Interfacess.Interface_vs_Abstract.Hero.AgilityHero;
import Interfacess.Interface_vs_Abstract.Hero.IntelHero;

public class Main {
    public static void main(String[] args) {

        AgilityHero hero1 = new AgilityHero("Alphart", 30);
        IntelHero hero2 = new IntelHero("Eudora", 20);
        
        hero1.display();
        hero1.attackBhs(hero2);
        hero2.spellBhs(hero1);
    }
}