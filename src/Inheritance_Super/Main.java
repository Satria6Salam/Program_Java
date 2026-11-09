package Inheritance_Super;

public class Main {
    public static void main(String[] args) {
        Hero1 hero1 = new Hero1();
        HeroStrength1 hero2 = new HeroStrength1();

        hero1.display();
        hero2.display();
        hero2.displaySuper();

    }
}
