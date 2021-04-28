package einheit3;

public class HaseApp {
    public static void main(String[] args) {
        Hase h = new Hase("Fritz");
        WeihnachtsHase w = new WeihnachtsHase("Klaus");
        OsterHase o = new OsterHase("Bugs");
        HasenStall s = new HasenStall();

        //h.fressen();
        //h.schlafen();
        //h.hoppeln();

        //w.fressen();
        w.hoppeln();
        //w.schlafen();
        w.verteileGeschenke();

        o.hoppeln();
        //o.fressen();
        //o.schlafen();
        o.versteckeOstereier();



        System.out.println("-------");
        h = o; //Osterhase auf hase referenz zuweisen
        h.hoppeln(); // ruft osterhaserefzeren auf
        OsterHase o2 = (OsterHase) h; //Downcasting von h zu Osterhase referenz
        o2.versteckeOstereier();
        System.out.println("-------");

        s.addHase(o);
        s.addHase(w);
        s.hoppeln();
    }
}
