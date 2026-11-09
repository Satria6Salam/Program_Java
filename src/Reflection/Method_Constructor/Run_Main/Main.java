package Reflection.Method_Constructor.Run_Main;

import Reflection.Method_Constructor.Hero.HeroAgility;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ArrayList_Generic.AgilityHero;


public class Main {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HeroAgility hero1 = new HeroAgility("Haya busa", 50);
        hero1.displayAll();

        System.out.println("\nMengambil seluruh method disub class");
        Method[] heroMethods = hero1.getClass().getDeclaredMethods();
        
        int angka = 1;
        for (Method method : heroMethods) {
            System.out.println(angka++ + ". " + method.accessFlags() + method.getName());
        }

        System.out.println("\nMengganti modifier pada method disub class");
        for (Method method : heroMethods) {
            if (method.getName().equals("setNickName")) {
                System.out.println("2. Menginvoke method setNickName()");
                method.setAccessible(true);
                method.invoke(hero1, "hayau");
            }

            if (method.getName().equals("setTypeHero")) {
                System.out.println("1. Menginvoke method setTypeHero()");
                method.setAccessible(true);
                method.invoke(hero1, "Intel"); // Mengubah nilai
            }
        }

        hero1.displayAll();

        // Acces constructor
        System.out.println("Acces Constructor");
        Object newHero = new Object();

        Constructor<?>[] heroConstructors = hero1.getClass().getDeclaredConstructors();
        for (Constructor<?> constructor : heroConstructors) {
            if (constructor.getName().equals("Reflection.Method_Constructor.Hero.HeroAgility")) {
                System.out.println("Sama dengan " + constructor.getName());
                Object[] obj = {"Lancelot", 20};
                newHero = constructor.newInstance(obj); 
            }
        }

        // Casting 
        AgilityHero hero2 = (AgilityHero) newHero;
        hero2.display();
    }
}
