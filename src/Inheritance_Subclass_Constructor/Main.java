package Inheritance_Subclass_Constructor;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Esmeralda", 100);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Alucard", 100);
        hero2.display();
    }
}
