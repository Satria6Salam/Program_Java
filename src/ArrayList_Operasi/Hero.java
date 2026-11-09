package ArrayList_Operasi;

public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString() {
        return "Hero : " + this.name;
    }

    public void display() {
        System.out.println("Hero : " + this.name + " health(" + this.health + ")");
    }
}
