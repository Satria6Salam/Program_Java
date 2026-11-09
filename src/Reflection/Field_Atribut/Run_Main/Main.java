package Reflection.Field_Atribut.Run_Main;

import Reflection.Field_Atribut.Hero.AgilityHero;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        AgilityHero hero1 = new AgilityHero("Lancelot", 100);
        hero1.displayAgility();

        // Acces modifier
        hero1.nickName = "Lance";
        hero1.displayAgility();
        // hero1.name = "Badang"; tidak bisa karean private
        // hero1.typeHero = "Intel"; tidak bisa karean private

        // Reflection
        Class<?> classHero1 = hero1.getClass();
        Class<?> parenstClassHero = hero1.getClass().getSuperclass();
        System.out.println("\nClass : " +classHero1);
        System.out.println("Parents : " + parenstClassHero);
        System.out.println("\nClass : " +classHero1.getName());
        System.out.println("Parents : " + parenstClassHero.getName());

        // Cek attribute dari objek hero1
        System.out.println("\nCek attribute dari objek hero1");
        Field[] heroField1 = classHero1.getFields(); // Berbentuk array field
        System.out.println("Jumlah attribute : " + heroField1.length);
        System.out.println("Attribute : " + heroField1[0].getName()); 

        // Cek attribute semua dari objek hero1
        System.out.println("\nCek semua attribute dari objek hero1");
        Field[] heroAllField1 = classHero1.getDeclaredFields();
        System.out.println("Jumlah attribute : " + heroAllField1.length);
        System.out.println("Attribute :");
        int angka = 1;
        for (Field field : heroAllField1) {
            System.out.println(angka++ + ". " + field.getName());
        }

        // Cek semua attribute dari super class
        System.out.println("\nCek semua attribute dari super class Hero");
        Field[] heroSuperClass = parenstClassHero.getDeclaredFields();
        System.out.println("Jumlah attribute : " + heroSuperClass.length);
        System.out.println("Attribute : ");
        int angka1 = 1;
        for (Field field : heroSuperClass) {
            System.out.println(angka1++ + ". " + field.getName());
        }

        // Mengubah nilai
        System.out.println("\nMengubah nilai");
        hero1.displayAgility();
        System.out.println("\nMenjadi!");
        // Mengubah nilai pada acces public di attribute sub class
        heroAllField1[0].set(hero1, "Lot");
        // Mengubah nilai pada acces private di attribute sub class
        heroAllField1[1].setAccessible(true); // Modifier private hanya bisa diubah dengan keyword ini
        heroAllField1[1].set(hero1, "Intel");
        // Mengubah nilai pada attribute super class
        heroSuperClass[0].setAccessible(true);
        heroSuperClass[0].set(hero1, "Fanny"); 
        heroSuperClass[1].setAccessible(true);
        heroSuperClass[1].set(hero1,50);
        hero1.displayAgility();
    }
}
