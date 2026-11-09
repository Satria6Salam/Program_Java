package Interfacess_Latihan.Main;

import Interfacess_Latihan.Hero.HeroAgility;
import Interfacess_Latihan.Hero.AttackMelee;
import Interfacess_Latihan.Hero.AttackRange;

public class Run_Main {
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Rubby", 100);
        HeroAgility hero2 = new HeroAgility("Alphart", 100);

        hero1.setAttackSkill(new AttackMelee(140));
        hero2.setAttackSkill(new AttackRange(100, 15));

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        System.out.println();
        hero2.attack(hero1);
    }
}
