class Player{
    String name;
    int level;
    double health;

    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, int level, double health){
        this.name = name;
        this.level = level;
        this.health = health;
    }

    void attackTo(Player enemyPlayer){
        double damage;
        double attackPower = this.weapon.attackPower;
        double enemydefencePower = enemyPlayer.armor.defencePower;
        
        if(attackPower > enemydefencePower){
            enemyPlayer.health -= attackPower;
            damage = attackPower;
            
        }else{
            damage = 0;
        }
        System.out.println(this.name+ " attack to "+ enemyPlayer.name+": "+damage+" dmg");
    }

    void defence(){

    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName: "+ this.name);
        System.out.println("Level: "+ this.level);
        System.out.println("Health: "+ this.health);
        System.out.println("Weapon: "+ this.weapon.weaponName + " | Attack: "+this.weapon.attackPower);
        System.out.println("Armor: "+ this.armor.armorName+ " | Defence: "+this.armor.defencePower+"\n");
    }

}

class Weapon{
    String weaponName;
    double attackPower;
    Weapon(String weaponName, int attackPower){
        this.weaponName = weaponName;
        this.attackPower = attackPower;
    }
}

class Armor{
    String armorName;
    double defencePower;
    Armor(String armorName,int defencePower){
        this.armorName = armorName;
        this.defencePower = defencePower;
    }
}

public class Main {
    public static void main(String[] args) {
        //membuat objek Player1
        Player player1 = new Player("Firo", 10, 100);
        Player player2 = new Player("Clever", 8, 80);
        
        //membuat objek weapon
        Weapon sword = new Weapon("sword", 10);
        Weapon spear = new Weapon("spear", 9);

        //membuat objek armor
        Armor ironArmor = new Armor("Iron Armor", 8);
        Armor diamondArmor = new Armor("Diamond Armor", 12);

        //player1
        player1.equipWeapon(sword);
        player1.equipArmor(diamondArmor);
        System.out.println("==STATISTIK "+ player1.name+" ==");
        player1.display();
        
        

        //player2
        player2.equipWeapon(spear);
        player2.equipArmor(ironArmor);
        System.out.println("==STATISTIK "+ player2.name+" ==");
        player2.display();

        //perang
        System.out.println("==PERANG PERTAMA==");
        player1.attackTo(player2);
        player1.display();
        player2.display();

    }
}
