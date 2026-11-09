package Latihan_OPP;

// Make class player
class Playergame {
    // Variable instance
    private String name;
    private int level;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    // Member object
    private Armorgame armorGame;
    private Weapongame weaponGame;

    // Constructor
    public Playergame(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 50;
        this.level = 1;
        this.incrementHealth = 10;
        this.incrementAttack = 10; 
        this.isAlive = true;    
    }

    // Method display
    public void display() {
        System.out.println("Player\t : " + this.name);
        System.out.println("Level\t : " + this.level);
        System.out.println("Health\t : " + this.maxHealt() + "/" + this.getHealt());
        System.out.println("Attack\t : " + this.getAttackPower());
        System.out.println("a live\t : " + this.isAlive);
        System.out.println("____________________________");
        
    }

    // Make method getName
    public String getName() {
        return this.name;
    }

    // Make method getHealt
    public int getHealt() {
        return maxHealt() - this.totalDamage;
    }

    // Make Method attack
    public void attack(Playergame opponent) {
        int damage = getAttackPower();

        System.out.println(this.name + " attacking " + opponent.getName() + " with damage " + damage);
        opponent.defense(damage);

        this.levelUP();
    } 

    // Make method defense 
    // delta demage = damage - defense power (strength)
    public void defense(int damage) {
        int defensePower = this.armorGame.getDefense();
        int deltaDamage;

        System.out.println(this.name + " defense power = " + defensePower);

        if (damage > defensePower) {
            deltaDamage = damage - defensePower;
        } else {
            deltaDamage = 0;
        }

        System.out.println("Damage earned = " + deltaDamage + "\n");
        this.totalDamage = this.totalDamage + deltaDamage;

        if (this.getHealt() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealt();
        }

        this.display();
    }

    // Make method levelUP
    private void levelUP() {
        this.level++;
    }
    
    // Make method setWeapongame
    public void setWeapongame(Weapongame weaponGame){
        this.weaponGame = weaponGame;
    }

    // Make method setArmorgame
    public void setArmorgame(Armorgame armorGame) {
        this.armorGame = armorGame;
    }
    // Make method total attack
    private int getAttackPower() {
        return this.baseAttack + (this.level * this.incrementAttack) +this.weaponGame.getAttackpower();
    }

    // Make method total health
    public int maxHealt() {
        return this.baseHealth + (this.level * this.incrementHealth) +this.armorGame.getAddHealth();
    }

}

// Make class weapon
class Weapongame {
    private String name;
    private int attackPower;

    public Weapongame(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public int getAttackpower() {
        return this.attackPower;
    } 

    // biar gak kuning
    void display() {
        System.out.println(this.name);
    }
}

// Make class armor
class Armorgame {
    private String name;
    private int strength;
    private int healt;

    public Armorgame(String name, int strength, int healt) {
        this.name = name;
        this.strength = strength;
        this.healt = healt;
    }

    public int getAddHealth() {
        return this.strength * 10 + this.healt;
    }

    public int getDefense() {
        return this.strength * 2;
    }

    // biar gak kuning
    void display() {
        System.out.println(this.name);
    }
}
public class Part2 {
    public static void main(String[] args) {
        // Assignment make object
        Playergame player1 = new Playergame("Satria");
        Armorgame armor1 = new Armorgame("Baju besi", 2, 100);
        Weapongame weapon1 = new Weapongame("Pistol", 50);
        player1.setArmorgame(armor1);
        player1.setWeapongame(weapon1);

        Playergame player2 = new Playergame("Badrus");
        Armorgame armor2 = new Armorgame("Baju tembaga", 1, 50);
        Weapongame weapon2 = new Weapongame("Pedang", 20);
        player2.setArmorgame(armor2);
        player2.setWeapongame(weapon2);

        player1.display();
        player2.display();

        player2.attack(player1);

    }
}
