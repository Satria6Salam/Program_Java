package ArrayList_Operasi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Lancelot", 100);
        Hero hero2 = new Hero("Aldous", 120);
        IntelHero intel = new IntelHero("Minotour", 130);
        AgilityHero agility = new AgilityHero("Johnson", 130);

        // Array List
        ArrayList<Hero> listHero = new ArrayList<Hero>();

        System.out.println("Operasi 1 : add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(intel);
        System.out.println(listHero);

        System.out.println("\nOperasi 2 : set");
        listHero.set(0, agility);
        System.out.println(listHero);

        System.out.println("\nOperasi 3 : remove");
        listHero.remove(0);
        System.out.println(listHero);

        System.out.println("\nOperasi 4 : get");
        System.out.println(listHero);
        Hero indekHero = listHero.get(0);
        indekHero.display();

        System.out.println("\nOperasi 5 : methtod");
        System.out.println("1. size()\t: " + listHero.size());
        System.out.println("2. isEmpty()\t: " + listHero.isEmpty());
        System.out.println("3. containts(hero2)\t: " + listHero.contains(hero1));
        System.out.println("   containts(agility)\t: " + listHero.contains(agility));
        System.out.println("4. indexOf(hero1)\t: " + listHero.indexOf(hero1));
        System.out.println("   indexOf(agility)\t: " + listHero.indexOf(agility));

    }
}
