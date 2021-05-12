public class Hero {
    String name;
    double hp;

    //konstruktor utk superclass
    Hero(String name,double hp){
        this.name = name;
        this.hp = hp;
    }
    //overloading construktor untuk superclass
    Hero(String name){
        this.name = name;
    }

    void displayName(){
        System.out.println("hero:"+this.name);
    }

    void displayAll(){
        System.out.println("hero:"+this.name);
        System.out.println("hp:"+this.hp);
    }

}
