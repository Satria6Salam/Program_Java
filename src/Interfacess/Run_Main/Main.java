package Interfacess.Run_Main;

import Interfacess.Hero.Hero;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Ruby", 10);
        Hero hero2 = new Hero("Alphart", 25);
        hero1.display();
        hero1.attack(hero2);
    }
}
