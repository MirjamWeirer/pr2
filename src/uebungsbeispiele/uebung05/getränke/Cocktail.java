package uebungsbeispiele.uebung05.getränke;

import java.util.ArrayList;

public class Cocktail extends Getraenk{
    protected ArrayList<Fluessigkeit> bestandteil;

    public Cocktail(String name){
        super(name);
        bestandteil = new ArrayList<>();
    }
    @Override
    public boolean brennt() {
        for (Fluessigkeit f: bestandteil){
            if (f.getAlkoholProzent() >30){
                return true;
            }
        }
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        int anz = 0;
        for (Fluessigkeit f : bestandteil){
             f.getName();
             anz++;
        }
        return anz;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        for (Fluessigkeit f: bestandteil){
            if (f.getAlkoholProzent() >30){
                return true;
            }
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        double menge = 0;
        for (Fluessigkeit f : bestandteil){
            menge += f.getMenge();
        }
        return menge;
    }

    @Override
    public int compareTo(Getraenk o) {
        return 0;
    }

    public void add (Fluessigkeit f){
        bestandteil.add(f);
    }
}
