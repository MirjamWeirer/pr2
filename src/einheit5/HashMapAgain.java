package einheit5;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAgain {
    public static void main(String[] args) {
        //hashmap consists out of key and value
        //there are never alone
        //special thin is how data is organized
        //there is no order like when did we enter data
        //they are "sorted" according to their keys
        //the keys are the "keys" to access the elements (the value)
        //"navigation helper for data structure"
        //if i know my navigation helper i can find my data (the value)
        //in nearly no time
        //lets compare to an arraylist: how long does ist take us to
        //find a value in there when we don't know the position?
        //-->worst case: search through whole arraylist
        //advantage: very fast access through the element
        HashMap<String,Integer> hashi = new HashMap<>();

        //usage is a small bit different than arraylist
        //enter new data only in paris
        //counting somethin is very typical
        //how often have you laughed today
        hashi.put("Kleinsasser",5);
        hashi.put("Summer",0);
        hashi.put("Kofler",3);

        //i can also just update data
        hashi.put("Kofler",4);

        //how can i access data in it
        //if i know the key is in there then just specify it
        System.out.println(hashi.get("Summer"));

        //however what happens if it is not in there
        System.out.println(hashi.get("Sumer"));

        //alternative (very useful if we count something)
        System.out.println( hashi.getOrDefault("Sumer",0));

        //check if a key is in hashmap
        System.out.println(hashi.containsKey("Kleinsasser"));

        //we can iterate over it
        for (String key : hashi.keySet()){
            System.out.println(key + " " + hashi.get(key));
        }

        //a little example
        //write a static method
        //HashMap<String, Integer> countLaugh(ArrayList<String>names)
        //the arraylist contains names of the people laughing
        //names =["Weirer", "Summer", "Wild", "Weirer","Safar",....]
        //hashmap schould contain how often somebody laughed e.g.
        //"Weirer" :2, "Summer":1, "Wild":1, ...

        ArrayList<String> names = new ArrayList<>();
        names.add("Weirer");
        names.add("Summer");
        names.add("Wild");
        names.add("Weirer");
        names.add("Safar");
        names.add("Kleinsasser");
        names.add("Kleinsasser");
        System.out.println(countLaugh(names));
    }

    public static HashMap<String,Integer> countLaugh(ArrayList<String>names){
        HashMap<String, Integer> laugh = new HashMap<>();

        for (String n : names){
            laugh.put(n,laugh.getOrDefault(n,0)+1);
//            Alternative
//            if (n.containsKey(n){
//                laugh.put(n,laug.get(n) +1);
//            }else{
//               laugh.put(n,1)
//            }
        }
        return laugh;
    }
}
