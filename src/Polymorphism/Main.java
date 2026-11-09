package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Lancelot");
        Hero hero2 = new HeroIntel("Fanny");
        HeroStrength hero3 = new HeroStrength("Atlas");
        HeroAgility hero4 = new HeroAgility("Banneta");

        // Cann't because class HeroStrength no inheritence class Hero
        // HeroStrength hero5 = new Hero("Satria");

        hero1.display();
        hero2.display();
        // Hero2.showOff(); karena hero intel dalam type data Hero
        hero3.display();
        hero3.showOff(); // bisa karean dalam type data yang sama
        hero4.display();

        

        // Array list
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3; // Casting
        kumpulanHero[3] = hero4; // Casting
        
        System.out.println("\n==========================");
        kumpulanHero[0].display();
        kumpulanHero[1].display();


        // Method show
        // kumpulanHero[3].showOff(); tidak bisa karena dalam type data hero
        System.out.println("\nContoh panggil method");
        hero3.showOff();

        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);

    }
}
