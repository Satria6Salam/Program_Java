package Inheritance;

// Inheritance adalah hubungan is a
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Satria";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Badrus";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Salam";
        hero3.display();
    }
}
