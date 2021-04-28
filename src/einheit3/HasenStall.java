package einheit3;

import java.util.ArrayList;

public class HasenStall {
    private ArrayList<Hase> hase;

    public HasenStall(){
        hase = new ArrayList<>();
    }

    public void addHase (Hase a){
        hase.add(a);
    }

    public void hoppeln(){
        for ( Hase h : hase){
            h.hoppeln();
        }
    }
}
