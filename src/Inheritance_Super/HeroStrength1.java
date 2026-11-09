package Inheritance_Super;

/* 
    this.name akan mengakses atribut name jika ada dikelas ini,
    jika tidak ada, maka akan mengakses di super kelas.

    super.name akan langsung mengakses atribut name di super kelas.
*/
public class HeroStrength1 extends Hero1 {
    String name = "Sub Class";

    void display() {
        System.out.println("Ini adalah : " + this.name);
        this.dummyMethod();
    }

    void displaySuper() {
        System.out.println("Ini adalah : " + super.name);
        super.dummyMethod();
    }

    void dummyMethod() {
        System.out.println("Method Sub Class");
    }
}
