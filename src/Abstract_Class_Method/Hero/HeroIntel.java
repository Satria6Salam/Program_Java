package Abstract_Class_Method.Hero;


// Inheritance dari abstract hero
public class HeroIntel extends Hero {
    
    public HeroIntel(String name) {
        super(name);
    }

    // Haru membuat method abstract level
    public void levelUp() {
        
    }

    @Override
    public void setLevel(int deltaLevel) {
        super.setLevel(deltaLevel);
    }

    // @Override
    // public void level() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'level'");
    // }

    

    
}
