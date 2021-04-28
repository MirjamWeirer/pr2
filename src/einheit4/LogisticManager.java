package einheit4;

import java.util.ArrayList;


public class LogisticManager {
    ArrayList<Moveable> moveAbleObjekt;
    public LogisticManager(){
        moveAbleObjekt = new ArrayList<>();
        //moveAbleObjekt.add(Car);
    }

    public void moveAll(String destination){
        for (Moveable m : moveAbleObjekt){
            m.move(destination);
        }
    }
}
