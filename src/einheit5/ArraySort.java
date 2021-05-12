package einheit5;

import einheit3.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        double [] darr = {7.2,2.4,100001.4,3.8,0.2,0.0003};

        //fast way to print array
        System.out.println(Arrays.toString(darr));

        //3.0E-4 -> scientific notation 3 * 10 ^-4
        Arrays.sort(darr);
        System.out.println(Arrays.toString(darr));

        //compareTo
        Dog [] dogs = {new Dog("grün",2) ,new  Dog("braun",1) , new Dog("blau",4), new Dog("grün",1)};
        System.out.println(Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));
        //same thing for lists (arrlist, linkedlist,...)
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("grün",2));
        dogList.add(new Dog("grün",2));
        dogList.add(new Dog("blau",4));
        dogList.add(new Dog("grün",1));
        System.out.println("--------");
        System.out.println(dogList);
        Collections.sort(dogList);
        System.out.println(dogList);
    }

}
