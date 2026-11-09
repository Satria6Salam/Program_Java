package Abstract_Class_Method.Hero;

// Abstract class
public abstract class Hero {
    private String name;
    private int level;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
    }

    public void display() {
        System.out.println("Aku adalah " + this.name);
        System.out.println("Level " + this.level);
    }

    // Methdo abstract
    public abstract void levelUp();

    public void setLevel(int deltaLevel) {
        this.level = this.level + deltaLevel;
    }
}
