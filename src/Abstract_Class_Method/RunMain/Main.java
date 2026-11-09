package Abstract_Class_Method.RunMain;

import Abstract_Class_Method.Hero.HeroIntel;

public class Main {
    public static void main(String[] args) {
        HeroIntel hero1 = new HeroIntel("Lancelot");
        hero1.display();

        hero1.setLevel(2);
        hero1.display();

        // Pada abstract class hero tidak bisa dibuat objeknya
    }
}