package Inheritance_Subclass_Constructor;

public class Hero {
    String name;
    double defense;

    Hero(String name, double defense) {
        this.name = name;
        this.defense = defense;
    }

    void display() {
        System.out.println("Hero : " + this.name);
    }
}
