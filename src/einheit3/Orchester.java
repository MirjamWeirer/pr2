package einheit3;

import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrumente> orchester;

    public Orchester(){
        orchester = new ArrayList<>();
    }

    public void addInstrumente (Instrumente i){
        orchester.add(i);
    }

    public int playAll(){
        int l = 0;
        for (Instrumente i : orchester){
           l = l + i.play();
        }
        return l;
    }
}
