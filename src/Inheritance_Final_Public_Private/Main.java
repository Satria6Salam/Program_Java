package Inheritance_Final_Public_Private;

/*
 *  VISIBILITY
 *  1. Public : Jika method atau attribute dalam public secara explisit,
 *     Maka subclass tidak boleh mengurangi visibility
 *  2. Private : Jika method ata attribute dalam private secara explisit,
 *     Maka subclass tidak dapat mengakse
 *  3. Final : method atau attribute dengan final keyword akan diwariskan,
 *     tetapi tidak bisa dioverride
 */

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Badang", 100);
        HeroStrength hero2 = new HeroStrength("Atlas", 100);

        hero1.display();
        hero2.display();

        System.out.println("______________________");
        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
        System.out.println("______________________");


        // Setter health
        hero1.setHealth(200);
        hero2.setHealth(200);

        hero1.display();
        hero2.display();

        System.out.println("----------------------");
        System.out.println("healt reset");
        hero1.setHealth("reset");
        hero1.display();

        System.out.println("----------------------");
        hero2.setHealth("reset");
        hero2.display();


    }
}
