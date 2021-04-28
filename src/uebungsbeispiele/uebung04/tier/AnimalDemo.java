package uebungsbeispiele.uebung04.tier;

import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
        Frog quaxi = new Frog("grün",2);
        Cat c = new Cat("Mia","braun",2);
        Dog d = new Dog("Tim","schwarz",2);
        Lion simba = new Lion("braun",2);
        Nature n = new Nature();
        quaxi.walk();
        quaxi.makeNoise();
        System.out.println("-----------");
        //upcasting works automatically nevertheless we could (Animal) quaxi
        Animal quaxiAsAnimal = quaxi;
        quaxiAsAnimal.makeNoise();
        quaxiAsAnimal.walk();
        System.out.println("----------");
        Frog sameQuaxi = (Frog) quaxiAsAnimal; //only works if there is really a frog on it
        sameQuaxi.makeNoise();
        sameQuaxi.walk();
        System.out.println("----------");
        c.makeNoise();
        c.walk();
        System.out.println("----------");
        Animal cAsAinmal = c;
        cAsAinmal.walk();
        cAsAinmal.makeNoise();
        System.out.println("----------");
        d.makeNoise();
        d.walk();
        System.out.println("----------");
        Animal dAsAinmal = d;
        d.walk();
        d.makeNoise();
        System.out.println("----------");
        simba.roar();
        simba.makeNoise();
        simba.walk();
        System.out.println("----------");
        Animal simbaAsAnimal = simba;
        simbaAsAnimal.makeNoise();
        simbaAsAnimal.walk();
        //simbaAsAnimal.roar nicht möglich da simbaAsAnimal eine Instanz von Animal ist
        n.addAnimal(quaxi);
        n.addAnimal(c);
        n.addAnimal(d);
        n.addAnimal(simba);
        //n.addAnimal(new Animal("black",8)); funktioniert nicht da Animal abstract ist
        System.out.println(n.countColor("braun"));
        //System.out.println(n.countColor("black"));

        //part3-interfaces
        Fly flyable = new Bird("blue");
        Bird b = (Bird) flyable;//downcasting if we know what is behind
        //b.winkeWinke(); //we see every method
        flyable.fly();

        Fly fly2 = giveMeSomethingThatCanFly();
        fly2.fly();
        System.out.println("-----------");
        ArrayList<Fly> allThingsInTheSky = new ArrayList<>();

        //allThingsInTheSky.add(quaxi) //does not work cause quaxi can*t fly
        allThingsInTheSky.add(flyable);
        allThingsInTheSky.add(fly2);

        for (Fly f : allThingsInTheSky){
            f.fly();
        }
    }

    public static Fly giveMeSomethingThatCanFly(){
        return new Bird("braun");
    }
}
