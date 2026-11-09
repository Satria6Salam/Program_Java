package Protected.Hero;

public class HeroStrength extends Hero {
    public HeroStrength(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Hero " + this.name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
