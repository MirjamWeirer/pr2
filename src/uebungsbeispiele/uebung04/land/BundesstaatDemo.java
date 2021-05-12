package uebungsbeispiele.uebung04.land;

import java.util.ArrayList;

public class BundesstaatDemo {
    public static void main(String[] args) {
        Bundesstaat land = new Bundesstaat();
        land.addLand(new Bundesland(4567));
        land.addLand(new Bundesland(45894));
        System.out.println(land.getBruttoSozialProdukt());
    }
}
