package uebungsbeispiele.uebung03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventKalender {
    List<Event> event;
    Event neu = new Event();

    public EventKalender(){
        event = new ArrayList<>();
    }

    public Event getByTitle(String title){
        for (Event t:event){
            if (event.contains(title)){
                return t;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort){
        ArrayList<Event> ortList = new ArrayList<>();
        for (Event o:event){
            if (event.contains(ort)){
                ortList.add(o);
            }
        }
        return ortList;
    }
    public ArrayList<Event> getByEintrittsPreis(double min, double max){
        ArrayList<Event> preis = new ArrayList<>();
        Event price = new Event();
        for (int i = 0; i < event.size();i++){
            /*if (event.contains(price.getEintrittspreis()).get > min &&event.get(i) < max) {
                    preis.add(price.getEintrittspreis());
            }

             */
        }
        return preis;
    }
    public Event getMostExpensiveByOrt (String Ort){
        return null;
    }
    public double getAvgPreisByOrt(String Ort){
        int count = 0;
        double result = 0;
        for (int i = 0; i < event.size(); i++){
            if (event.contains(Ort)){
                //result += event;
                count ++;
            }
        }
        return result;
    }
    public HashMap<String,Integer>getCountEventsByOrt(){
       HashMap<String,Integer> event = new HashMap<>();
       Integer anzahl=0;
       event.put(neu.getOrt(), anzahl);
       return event;
    }
    public HashMap<String,Double>getSumPriceEventsByOrt(){
        HashMap<String,Double> event = new HashMap<>();
        Double anzahl=0.0;
        event.put(neu.getOrt(), anzahl);
        return event;
    }
}
