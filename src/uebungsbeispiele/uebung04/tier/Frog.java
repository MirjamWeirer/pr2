package uebungsbeispiele.uebung04.tier;

import uebungsbeispiele.uebung04.tier.Animal;

public class Frog extends Animal {
    public Frog(String color, int countEyes){
        super(color, countEyes);
    }

    @Override
    public void walk(){
        System.out.println("Jump Jump");
    }

    @Override
    public void makeNoise(){
        System.out.println("Quark Quark");
    }
}
