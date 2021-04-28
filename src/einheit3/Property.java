package einheit3;

import java.util.ArrayList;
import java.util.HashMap;

public class Property {
    //lat ist Breitengrad
    //lon ist Längengrad
    private double lat, lon;
    private double sizeInm2;
    private ArrayList<String> owner;//=new ArrayList<>()//we can also initialize here -> this code is executed like it is in the constuktor
    private HashMap<String,Double> moneyOwed;

    public Property(double lat, double lon, double size, String firstOwner){
        this.lat = lat;
        this.lon = lon;
        this.sizeInm2 = size;
        this.owner = new ArrayList<>();//complex data types we have to create an instance
        this.owner.add(firstOwner);
        this.moneyOwed = new HashMap<>();
    }
    //if we get a loan of a property we have to add an owner
    public void addOwner(String owner, double money){
        this.owner.add(owner);

        if(moneyOwed.containsKey(owner)){
            //we already owe something
            double m = moneyOwed.get(owner);
            moneyOwed.put(owner, money + m);
        }else {
            //first time we borrow something
            moneyOwed.put(owner, money);
        }

        //there is a more efficient method
        //instead
        //double oldMoney = moneyOwed.getOrDefault(owner,0.0);
        //moneyOwed.put(owner, money + oldMoney);
    }
    //remove owner only possible if we are no longer borrowing money from them
    public boolean removeOwener(String o){
        Double m = moneyOwed.get(o);
        if (m == null){
            //we do now owe money we can try to remove name out of owners list
            return owner.remove(o);
        }
        //we could habe a problem here because m is double and does not save the number correctly
        if (m != 0){
            return false;
        }
        owner.remove(o);
        moneyOwed.remove(o);
        return true;
    }
    //payback -Schulden tilgen
    //falls es den die person mit dem Namen owner gibt
    //soll der Schuldenstand um die Summe amount erniedrigt werden
    //->liefert true zurück falls erfolgreich Schulden gesenkt oder getilgt wurden
    //->liefert false  zurück wen es owner nicht gibt ODER wenn wir mehr Geld zurück zahlen als noch schuldig sind (dann nichts abziehen)
    public boolean payback(String owner, double amount){
        Double m = moneyOwed.get(owner);
        if (m == null){
            return false;
        }
        if (m < amount){
            return false;
        }
        moneyOwed.put(owner, m - amount);
        return true;

    }
}
