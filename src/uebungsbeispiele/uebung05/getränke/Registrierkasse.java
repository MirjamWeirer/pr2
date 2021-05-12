package uebungsbeispiele.uebung05.getränke;

import uebungsbeispiele.uebung05.figures.Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Registrierkasse {
    private ArrayList<Getraenk> kasse;
    static private int verkaufteGetränke;

    public Registrierkasse(){
        kasse = new ArrayList<>();
        verkaufteGetränke = 0;
    }

    public static int getVerkaufteGetränke() {
        return verkaufteGetränke;
    }

    public void verkauft(Getraenk g){
        kasse.add(g);
        verkaufteGetränke++;
    }

//    public void printGetraenkeSoriterNachAnzahlZutaten(){
//        Collections.sort(new AnzahlZutatatenComperator() {
//
//        });
//    }

    public void printGetraenkeSortiertNachMl(){
        //comperator noch machen
    }

    public HashMap<Integer,ArrayList<Getraenk>>getGetraenkeAufgeteiltNachZutaten(){
        HashMap<Integer,ArrayList<Getraenk>> getraenk = new HashMap<>();
        return getraenk;
    }
}
