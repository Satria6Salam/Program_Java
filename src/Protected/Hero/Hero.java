package Protected.Hero;

public abstract class Hero {
    // tidak disarankan diattribute
    protected String name; // hanya bisa diakses dari subclass hero
    private int level;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
    }

    public abstract void display();

    protected String getName() {
        String get = "Hero " + this.name + " Level " + this.level;
        return get;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
