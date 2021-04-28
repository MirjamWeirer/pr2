package uebungsbeispiele.uebung03;

import java.util.HashMap;

public class Blackjack {
    HashMap<Player,Integer> players;

    public Blackjack(){
        players=new HashMap<>();
    }

    public boolean add(Player player){
        Integer card = 0;
        players.put(player, card);
        return true;
    }
    //public boolean addCard(Player player, Integer cardValue){}
}
