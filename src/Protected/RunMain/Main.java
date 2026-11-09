package Protected.RunMain;

import Protected.Hero.HeroStrength;

public class Main {
    public static void main(String[] args) {
        HeroStrength hero1 = new HeroStrength("Kimmy");
        hero1.display();

        System.out.println(hero1.getName());

        hero1.setName("Badang");
        hero1.display();
    }
}
