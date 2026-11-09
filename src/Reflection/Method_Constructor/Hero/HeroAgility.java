package Reflection.Method_Constructor.Hero;

public class HeroAgility extends Hero {
    private String typeHero = "Agility";
    private String nickName;

    public HeroAgility(String name, double health) {
        super(name, health);
    }

    private void setTypeHero(String typeHero) {
        this.typeHero = typeHero;
    }

    private void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void displayAll() {
        this.display();
        System.out.println("Type\t: " + this.typeHero);
        System.out.println("Nickname : " + this.nickName);
    }
}
