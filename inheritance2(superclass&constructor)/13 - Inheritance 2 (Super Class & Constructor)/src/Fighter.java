public class Fighter extends Hero {
    String name = "bambang";
    //untuk memanggil constructor dgn inheritance
    //tetap panggil konstruktor dengan parameternya
    //dan gunakan super() untuk mengisi parameternya
    Fighter(String name,double hp){
        super(name, hp);
    }

    //overloading subclass
    Fighter(String name){
        super(name);
    }

    //penggunaan this.name akan mencari name di class ini, jika tidak
    //ada maka akan mencari ke kelas superclass

    //penggunaan super.name akan selalu memanggil dari superclass
    void display(){
        System.out.println("ini adalah di subclass:"+this.name);
    }

    void displaySuper(){
        System.out.println("Ini adalah superclass:"+super.name);
    }
}
