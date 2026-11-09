package Superclass_Object;
/*
 * 1. Class Object : suda ada dijava yang dijadikan superclass di semua subclass dalam java
 */

public class Main {
    public static void main(String[] args) {
        Hero hero1 =new Hero("Ling");
        hero1.display();

        Object hero2 = hero1;
        System.out.println(hero2);

        String hero1_str = hero1.toString();
        String hero2_str = hero2.toString();
        System.out.println(hero1_str);
        System.out.println(hero2_str);

        System.out.println("________________________");

        // keyword dari superclass Object (equels)
        System.out.println(hero1.equals(hero2));

        Hero hero3 =new Hero("Ling");
        Hero hero4 =new Hero("Lingg");
        Hero hero5 = new Hero("Barats");
        SuperMan hero6 = new SuperMan("Barats");



        // Override equals diclass hero
        System.out.println(hero3.equals(hero4));
        System.out.println(hero3.equals(hero1));

        System.out.println(hero5.equals(hero6));







    }
}
