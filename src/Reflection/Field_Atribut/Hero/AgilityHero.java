package Reflection.Field_Atribut.Hero;

public class AgilityHero extends Hero {
    public String nickName;
    private String typeHero = "Agility";

    public AgilityHero(String name, double health) {
        super(name,health);
    }

    // @Override
    // public void display() {
    //     super.display();
    //     System.out.println("Type Hero : " + this.typeHero);
    //     System.out.println("Nickname : " + this.nickName);
    // }

    // Versi 2
    public void displayAgility() {
        this.display();
        System.out.println("Type \t: " + this.typeHero);
        System.out.println("Nickname : " + this.nickName);
    }

}
