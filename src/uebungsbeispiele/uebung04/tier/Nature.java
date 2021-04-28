package uebungsbeispiele.uebung04.tier;

import java.util.ArrayList;

public class Nature {
    private ArrayList<Animal> animals;

    public Nature() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public int countColor(String color) {
        int count = 0;
        for (int i = 0; i < animals.size(); i++)
            if (color.equals(animals.get(i).color)) {
                count++;
            }
        return count;
    }
}
