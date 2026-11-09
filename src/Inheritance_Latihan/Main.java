package Inheritance_Latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Youzong", 100, 10);
        HeroStrength hero2 = new HeroStrength("Badang", 100, 15);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
        
    }
}
