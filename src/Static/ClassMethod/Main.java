package Static.ClassMethod;

import java.util.ArrayList;

class Player {
    private String name;
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    public Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    public static ArrayList<String> getNameList() {
        return Player.nameList;
    }

    public static void displayNumberOfPlayer() {
        System.out.println("Number of player : " + Player.numberOfPlayer);
    }

    public void display() {
        System.out.println("Name\t: " + this.name);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Badang");
        Player player2 = new Player("Saber");
        Player player3 = new Player("Alucard");
        Player player4 = new Player("Ling");
        Player player5 = new Player("Helcard");

        player1.display();
        player2.display();
        player3.display();
        player4.display();
        player5.display();

        Player.displayNumberOfPlayer();
        System.out.println("\nArray list");
        System.out.println("Name : " + Player.getNameList());

    }
}
