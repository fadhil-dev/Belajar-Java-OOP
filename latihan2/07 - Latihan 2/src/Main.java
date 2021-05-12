class Player{
    private String name;
    private int level;
    private int atkLevelUp;
    private int defLevelUp;
    private double hp;
    private double totalDamage;
    private double atkPower;
    private double defPower;
    private boolean alive;
    private Weapon weapon;
    private Armor armor;

    Player(String name){
        this.name = name;
        this.hp = 100;
        this.atkPower = 10;
        this.defPower = 10;
        this.level = 1;
        this.atkLevelUp = 10;
        this.defLevelUp = 10;
        this.alive = true;
    }
    public String getName(){
        return this.name;
    }

    public double getCurrentHP(){
        return this.sumDefPower() - this.totalDamage;
    }

    public void attackEnemy(Player opponent){
        // hitung damage
        double damage = this.sumAtkPower();
        // print event
        System.out.println("\n"+this.name + " is attacking " + opponent.getName() + " with " + damage);
        // attack si opponent
        opponent.defence(damage);
        this.setLevelUp();
        System.out.println(this.name+" is level up!");
        this.display();
        opponent.display();
    }

    public void defence(double damage){

        // receive damage
        double defencePower = this.armor.getDefPower();
        double deltaDamage;

        System.out.println(this.name + " defence power = "+ defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        
        System.out.println("damage earned = " + deltaDamage);
        
        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getCurrentHP() <= 0){
            this.alive = false;
            this.totalDamage = this.sumDefPower();
        }
    }
    private double sumAtkPower(){
        return this.atkPower+level *atkLevelUp+this.weapon.getAtkPower();
    }

    private double sumDefPower(){ //defpower kita gunakan untuk nambah hp
        return this.hp+defPower+level*defLevelUp+this.armor.getDefPower();
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    private int setLevelUp(){
        return this.level++;
    }

    public void display(){
        System.out.println("\nName\t\t: "+this.name);
        System.out.println("Level\t\t: "+this.level);
        System.out.println("HP\t\t: "+getCurrentHP()+"/"+this.sumDefPower());
        System.out.println("Attack\t\t: "+this.sumAtkPower());
        System.out.println("Status\t\t: "+this.alive);
    }
}

class Weapon{
    private String name;
    private double atkPower;

    Weapon(String name, double atkPower){
        this.name = name;
        this.atkPower = atkPower;
    }

    public double getAtkPower(){
        return this.atkPower;
    }
}

class Armor{
    private String name;
    private double defPower;

    Armor(String name, double defPower){
        this.name = name;
        this.defPower = defPower;
    }

    public double getDefPower(){
        return this.defPower;
    }

}

public class Main {
    public static void main(String[] args) throws Exception {
        //membuat objek player
        Player player1 = new Player("Firo");
        Player player2 = new Player("Ilham");
        //membuat objek senjata
        Weapon sword = new Weapon("Sword", 70);
        Weapon excalibur = new Weapon("Excalibur", 100);
        //membuat objek armor
        Armor ironArmor = new Armor("Iron Armor", 30);
        Armor diamondArmor = new Armor("Diamond Armor", 50);
        //statistic
        System.out.println("==PLAYER STATISTIC==");
        //set weapon dan armor player 1
        player1.setWeapon(excalibur);
        player1.setArmor(ironArmor);
        player1.display();
        //set weapon dan armor player 2
        player2.setWeapon(sword);
        player2.setArmor(diamondArmor);
        player2.display();
        //perang dimulai
        System.out.println("\n==WAR BEGIN!==");
        player1.attackEnemy(player2);
        player2.attackEnemy(player1);
        player1.attackEnemy(player2);
        player2.attackEnemy(player1);
        player1.attackEnemy(player2);
        player2.attackEnemy(player1);

    }
}
