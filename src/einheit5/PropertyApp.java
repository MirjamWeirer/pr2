package einheit5;

import java.util.ArrayList;

public class PropertyApp {
    public static void main(String[] args) {
        //test the stuff
        House h1 = new House("Mayer Martin", 550, "Reinerweg 28", 2010);
        House h2 = new House("Hinterseer Hansi", 600, "Mailerstraße 28", 2020);
        House h3 = new House("Bacher Anna", 500, "Reinstromweg 28", 1990);
        Flat f1 = new Flat("Kleinsasser Steff",90,"Weidenstrasse 15",true,1);
        Flat f2 = new Flat("Weiden Max",85.5,"Lichtenweg 2",false,2);
        Flat f3 = new Flat("Mittenegger Paul",75,"Weidenstrasse 15",true,3);
        RentedFlat rf1 = new RentedFlat("Weirer Mirjam",70,"Papiermühlgasse 28",false,1,true);
        RentedFlat rf4 = new RentedFlat("Weirer Mirjam",70,"Papiermühlgasse 28",false,1,false);
        RentedFlat rf2 = new RentedFlat("Feigel Jasmin",50,"Karl-Maria von Webergasse 8",false,2,false);
        RentedFlat rf3 = new RentedFlat("Weirer Petra",75.5,"Ausserstraße 18",false,3,true);

        System.out.println(h1.upfrontCost());
        System.out.println(h1.monthlyCost());
        System.out.println("-----------");
        System.out.println(h2.upfrontCost());
        System.out.println(h2.monthlyCost());
        System.out.println("-----------");
        System.out.println(h3.upfrontCost());
        System.out.println(h3.monthlyCost());
        System.out.println("-----------");
        System.out.println(f1.upfrontCost());
        System.out.println(f1.monthlyCost());
        System.out.println("-----------");
        System.out.println(f2.upfrontCost());
        System.out.println(f2.monthlyCost());
        System.out.println("-----------");
        System.out.println(f3.upfrontCost());
        System.out.println(f3.monthlyCost());
        System.out.println("-----------");
        System.out.println(rf1.upfrontCost());
        System.out.println(rf4.upfrontCost());
        System.out.println(rf1.monthlyCost());
        System.out.println("-----------");
        System.out.println(rf2.upfrontCost());
        System.out.println(rf2.monthlyCost());
        System.out.println("-----------");
        System.out.println(rf3.upfrontCost());
        System.out.println(rf3.monthlyCost());
        System.out.println("-----------");
        //airbnb parade - we rent everything on arbinb for the next week
        ArrayList<RentAirBnB> air = new ArrayList<>();
        air.add(h1);
        air.add(f1);
        air .add(rf1);
        EScooter scoot = new EScooter(25);
        air.add(scoot);
        for (RentAirBnB a : air){
            System.out.println(a.rentAirBnB(7));
        }
    }
}
