package Overloading;

public class Main{
    public static void main(String[] args) {
        Name name1 = new Name();
        Name name2 = new Name("Satria");
        Name name3 = new Name("Badrus");
        Name name4 = new Name();

        name1.display();
        name2.display();
        name3.display();
        name4.display();
    }
}
