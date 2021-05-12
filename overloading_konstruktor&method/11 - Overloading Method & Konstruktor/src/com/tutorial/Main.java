package com.tutorial;
import com.terminal.*;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Console.log("hai");
        Console.log(2);
        
        Player player1 = new Player("fadhil");
        player1.show();
        System.out.println(Operasi.perkalian(2, 4));
        LinkedList <Integer> ll = new LinkedList<Integer>();
        ll.add(003);
        ll.add(007);
        ll.add(005);
        ll.add(001);

        for(int i=1; i<ll.size(); i++){
            for(int j=i; j>0; j--){
                if(ll.get(j) < ll.get(j-1)){
                    ll.set(ll.get(j),ll.get(j-1));
                }
            }
        }
        System.out.println(ll);
    }

}
