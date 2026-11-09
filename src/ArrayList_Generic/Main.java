package ArrayList_Generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Saber", 100);
        Hero hero2 = new Hero("Ling",100);
        IntelHero hero3 = new IntelHero("Atlas", 150);
        AgilityHero hero4 = new AgilityHero("Franco", 150);

        // Array sederhana
        Hero[] listHero = new Hero[3];

        listHero[0] = hero1;
        listHero[1] = hero2;
        listHero[2] = hero3;
        // listHero[4] = hero4; indeks out of bounds

        for (Hero hero : listHero) {
            hero.display();
        }

        // Arraylist
        ArrayList<Hero> listHero2 = new ArrayList<Hero>();

        listHero2.add(hero1);
        listHero2.add(hero2);
        listHero2.add(hero3);
        listHero2.add(hero4);

        System.out.println("\n------ Array List ------");
        for (Hero her : listHero2) {
            her.display();
        }

        System.out.println("\nReference");
        hero3.setName("Badang");

        System.out.println("\n------ Array ------");
        for (Hero hero : listHero) {
            hero.display();
        }

        System.out.println("\n------ Array List ------");
        for (Hero her : listHero2) {
            her.display();
        }

    }
}