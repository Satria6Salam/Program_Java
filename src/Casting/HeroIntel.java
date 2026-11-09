package Casting;

public class HeroIntel extends Hero{
    public String type;

    HeroIntel(String name, double health) {
        super(name,health);
        this.type = "Intel";
    }

    // Method display
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero");
    }


}
