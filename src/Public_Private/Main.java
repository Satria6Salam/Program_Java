package Public_Private;

// Make class Player
class Player {
    // Varible instance
    String name; // Default, can be read and write outside class
    public int experience; // Public, can be read and write outside class
    private int health; // Private, can only be read dan write in class

    // Constructor
    Player (String name, int experience, int health) {
       this.name = name;
       this.experience = experience;
       this.health = health;
    }

    // Make method display, modifier default
    void display(){
        plusHealt();
        System.out.println("\nName\t: " + this.name);
        System.out.println("Exp\t: " + this.experience);
        System.out.println("Helth\t: " + this.health); // can be read, bacause in the same class
    }

    // Make method set name, modifier public
    public void setName (String name) {
        this.name = name;
    }

    // Make method set healt, modifier private
    private void plusHealt () {
        this.health += 10;
    }


}
public class Main {
    public static void main(String[] args) {
        // Assignmet make object 
        Player player1 = new Player("Satria", 2, 100);

        System.out.println("______ Default ______");
        System.out.println(player1.name); // Read name 
        player1.name = "Rama"; // Write name
        System.out.println(player1.name); // Read name 

        System.out.println("______ Public ______");
        System.out.println(player1.experience); // Read.experience 
        player1.experience = 10; // Write.experience
        System.out.println(player1.experience); // Read.experience 
        
        // (can not visible, because private)
        // System.out.println("______ Private ______"); 
        // System.out.println(player1.health); // Read.health 
        // player1.health = 20; // Write.health
        // System.out.println(player1.health); // Read.health 

        // Default
        player1.display(); // can read, 

        // public
        player1.setName("Doni");
        player1.display();

        // Private
        player1.display();


    }
}

