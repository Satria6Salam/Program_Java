package Latihan_OPP;

// Class player
class Player{
    String name;
    double healt;
    int level;
    // Objek member
    Weapon weapon;
    Armor armor;
   

    // Constructor
    Player(String name, double healt){
        this.name = name;
        this.healt = healt;
    }

    
    // Method void
    void attack(Player opponentPlayer){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponentPlayer.name + " with power : " + attackPower);
        opponentPlayer.defense(attackPower);
    }

    void defense(double attackPower){
        double damage;
        if (this.armor.defensePower < attackPower) {
            damage = attackPower - this.armor.defensePower;
        } else {
            damage = 0;
        }

        this.healt = this.healt - damage;
        System.out.println(this.name + " gets damage : " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\n");
        System.out.println("Name  : " + this.name);
        System.out.println("Healt : " + this.healt + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// Class senjata
class Weapon{
    String name;
    double attackPower;

    // Constructor
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    // Method void 
    void display(){
        System.out.println("Weapon : " + this.name + " | Attack Power : " + this.attackPower) ;
    }
}

// Class armor
class Armor{
    String name;
    double defensePower;

    // Constructor
    Armor(String name, double defancePower){
        this.name = name;
        this.defensePower = defancePower;
    }

    // Method void
    void display(){
        System.out.println("Armor  : " + this.name + " | Dafence Power : " + this.defensePower);
    }
}

public class Part1 {
    public static void main(String[] args) {
        // Assignment membuat objek player
        Player player1 = new Player("Satria", 300);
        Player player2 = new Player("Rizqi", 300);

        // Assignment membuat objek weapon
        Weapon weapon1 = new Weapon("Pistol", 30);
        Weapon weapon2 = new Weapon("Pedang",20);

        // Assignment membuat objek armor
        Armor armor1 = new Armor("Baju besi", 10);
        Armor armor2 = new Armor("Baju kuningan", 5);
        
        player1.equipWeapon(weapon1);
        player1.equipArmor(armor1);
        player1.display();

        player2.equipWeapon(weapon2);
        player2.equipArmor(armor2);
        player2.display();
        // player1.weapon.display();

        System.out.println("\n PERTEMPURAN   ");
        System.out.println("=================");
        System.out.println("\nEpisode 1");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode 2");
        player2.attack(player1);
        player1.display();
        player2.display();
        
        
    }
    
}
