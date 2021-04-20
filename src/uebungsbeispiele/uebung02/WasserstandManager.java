package uebungsbeispiele.uebung02;

import java.util.ArrayList;

public class WasserstandManager {
    //public static void main(String[] args) {
        Wasserstand grundwasser = new Wasserstand();
        ArrayList<Wasserstand> wasserStand = new ArrayList<>();
        //wasserStand.add(0,Wasserstand);
    //}
    public Wasserstand findById(int id){
        for (int i = 0; i < wasserStand.size(); i ++){
            if (wasserStand.contains(id)){
                return wasserStand.get(i);
            }
        }
        return null;
    }
    public ArrayList<Wasserstand>findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> gewaesser = new ArrayList<>();
        for(int i = 0; i < wasserStand.size();i++){
            if (wasserStand.contains(gewaesserName)){
                gewaesser.add(wasserStand.get(i));
            }
        }
        return gewaesser;
    }
    /*
    public Wasserstand findLastWasserstand(String gewaesserName){

        return grundwasser.getZeitpunkt();
    }

     */
    public double calcMittlererWasserstand(String gewaesserName, String ort){
        double result = 0;
        for (Wasserstand s:wasserStand){
            if (wasserStand.contains(gewaesserName)&&wasserStand.contains(ort)){
                result = result;// durch iwas
            }
        }
        return result;
    }
    public ArrayList<Wasserstand>findByZeitpunkt(int von, int bis, String gewaesserName, String ort){
        ArrayList<Wasserstand> zeitpunkt = new ArrayList<>();
        for (int i = 0; i < wasserStand.size();i++){
            if (wasserStand.contains(gewaesserName)&&wasserStand.contains(ort)){
                zeitpunkt.add(wasserStand.get(i));
            }
        }
        return zeitpunkt;
    }
}
