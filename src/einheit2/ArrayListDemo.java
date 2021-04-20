package einheit2;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> namesForLuckyDraw = new ArrayList<String>(50);

        //add elements to end of arraylist
        namesForLuckyDraw.add("Relindis");
        namesForLuckyDraw.add("Luisa");
        namesForLuckyDraw.add("Stefanie");
        namesForLuckyDraw.add("Julia");

        //how many element in arraylist
        System.out.println(namesForLuckyDraw.size());

        //get element from arraylist
        System.out.println(namesForLuckyDraw.get(0));

        //remove element from arraylist (the second element)
        namesForLuckyDraw.remove(1);
        System.out.println(namesForLuckyDraw.get(1));

        //is element in there?
        System.out.println(namesForLuckyDraw.contains("Julia"));

        //how to iterate over it - possiblity 1 for loop
        for (int i = 0; i < namesForLuckyDraw.size(); i++) {
            System.out.println(namesForLuckyDraw.get(i));
        }

        //how to iterate over it - possibility 2 for each loop
        for (String s : namesForLuckyDraw){
            System.out.println(s);
        }

        //how to iterate over it - possiblity 3 iterator
    }
}
