package Inheritance_Overriding_Method;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Satria";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Salam";
        hero2.defense = 200;
        hero2.display();
    }
}
