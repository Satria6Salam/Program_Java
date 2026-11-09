package Casting;

public class Main {
    public static void main(String[] args) {

        // contoh casting
        // int angka = 5;
        // double angkaDouble = (int) angka;
        // System.out.println(angkaDouble);

        HeroIntel hero1 = new HeroIntel("Youzong",100);
        hero1.display();

        // Casting ke super class
        System.out.println("------Casting UP------");
        Hero heroCasting = (Hero) hero1;
        heroCasting.display();

        // Ada field dan method yang hilang
        // System.out.println(heroCasting.type);

        // Down casting dari super class ke sub class, kecuali 
        // Casting ke 2x
        // Bisa di down casting dari super class ke sub class, asal bentuk awalnya sama
        System.out.println("------Casting Down------");
        HeroIntel heroCasting1 = (HeroIntel) heroCasting;
        heroCasting1.display();
        System.out.println(heroCasting1.type);

    }
}