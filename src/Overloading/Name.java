package Overloading;

public class Name {
    private String name;
    private static int jumlahObjek;

    public Name() {
        Name.jumlahObjek++;
        this.name = "Name" + Name.jumlahObjek;
    }

    public Name(String name) {
        Name.jumlahObjek++;
        this.name = name;
    }

    public void display() {
        System.out.println("Name : " + this.name);
    }
}
