package Encapsulasi;

// Make class Data
class Data {
    // Varible instance
    public int intPublic;
    private int intPrivate;
    private double douPrivate;

    // Make constructor, modifier public
    public Data() {
        this.intPublic = 5;
        this.intPrivate = 10;
        this.douPrivate = 1.5;
    }

    // Make method display
    public void display() {
        System.out.println("Int Public : " + this.intPublic);
        System.out.println("Int Private : " + this.intPrivate);
        System.out.println("Int Private : " + this.douPrivate);

    }

    // Make method getter, modifier public
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // Make method setter, modifier public
    public void setDouPrivate(double douPrivate) {
        this.douPrivate = douPrivate;
    }
}

// Make class Lingkaran
class Lingkaran {
    private double diameter;

    // Make constructor
    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // Make method setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // Make method getter 
    public double getJari2() {
        return this.diameter / 2;
    }
    
    // Make method getter luar
    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }
}
public class Main {
    public static void main(String[] args) {
        // Assignment Make object
        Data data1 = new Data();

        // Modifier public
        System.out.println("Public : " + data1.intPublic); // Read
        data1.intPublic = 10; // Write
        System.out.println("Set Public : " + data1.intPublic); // Read

        // Modifier private, read only can with use GETTER
        int number = data1.getIntPrivate();
        System.out.println("Getter : " + number);

        // Modifier private, can only write with use SETTER
        data1.setDouPrivate(2.5);

        // Assignment make object lingkaran
        Lingkaran lingkaran1 = new Lingkaran(12);
        System.out.println("Jari-jari : " + lingkaran1.getJari2());
        lingkaran1.setJari2(7);
        System.out.println("Jari-jari : " + lingkaran1.getJari2());
        System.out.println("Luas : " + lingkaran1.getLuas());


    }   
    
}

