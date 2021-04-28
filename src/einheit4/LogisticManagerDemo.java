package einheit4;

import java.util.ArrayList;

public class LogisticManagerDemo {
    public static void main(String[] args) {
        Moveable move1 = new Car("VW Golf", "Blue",345.35);
        Moveable move2 = new Shirt("Addidas","XS","red");
        ArrayList<LogisticManager> m = new ArrayList<>();
        m.add((LogisticManager) move1);
        m.add((LogisticManager) move2);
        ((LogisticManager) move2).moveAll("Wien");
        ((LogisticManager) move2).moveAll("Graz");
    }
}
