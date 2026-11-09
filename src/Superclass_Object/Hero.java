package Superclass_Object;
//  public class Hero extends Object
public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Hero " + this.name);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            System.out.println("Object dengan reference sama");
            return true;
        } else if (this.getClass() == otherObject.getClass()) {
            System.out.println("Object dengan kelas yang sama");
            System.out.println("reference beda");

            // Casting class object ke class hero
            Hero hero = (Hero) otherObject;

            if (this.name == hero.name) {
                System.out.println("Nama sama");
                return true;
            } else {
                System.out.println("Nama beda");
                return false;
            }
            
        } else {
            System.out.println("Tidak sama semua");
            return false;
        }
    }
}
