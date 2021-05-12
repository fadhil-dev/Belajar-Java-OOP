public class Assasin extends Hero {
    int hp;
    @Override //overriding methods
    void display(){
        System.out.println("Hero:"+this.name);
        System.out.println("Hp:"+this.hp);
        /*intinya overriding methods ini akan mengecek diclass
        terlebih dahulu ada atau tidak, jika tidak ada baru
        cek ke parent class(superclass) */
    }
}
