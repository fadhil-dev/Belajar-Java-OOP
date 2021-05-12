//static itu maksudnya akan mengisi semua data itu ditiap kelas
import java.util.ArrayList;
class Player{
    String name;
    private static int sumPlayer;
    private static ArrayList <String> listPlayer = new ArrayList<String>();
    Player(String name){
        this.name = name;
        Player.sumPlayer ++;
        Player.listPlayer.add(name);
    }

    public static int getSumPlayer(){
        return Player.sumPlayer;
    }

    public static ArrayList<String> listPlayer(){
        return Player.listPlayer;
    }

    public static void print(){
        for(int a=0; a<listPlayer.size(); a++){
            System.out.println("Player "+(a+1)+"\t: "+listPlayer.get(a));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //membuat objek player
        Player player1 = new Player("Kirito");
        Player player2 = new Player("Asuna");
        Player player3 = new Player("Alice");
        //menampilkan jumlah player
        System.out.println("Jumlah Player\t: "+Player.getSumPlayer());
        //menampilkan daftar player
        System.out.println(Player.listPlayer());
        //menampilkan dengan lebih estetik
        Player.print();
    }
}
