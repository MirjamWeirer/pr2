package einheit3;

public class InstrumenteApp {
    public static void main(String[] args) {
        Gitarre git = new Gitarre(3);
        Trommel tro = new Trommel(5);
        Trompete t = new Trompete(8);
        Geige g = new Geige(2);
        Orchester o = new Orchester();

        o.addInstrumente(git);
        o.addInstrumente(tro);
        o.addInstrumente(t);
        o.addInstrumente(g);


        //System.out.println(o.playAll());

        o.addInstrumente(new Querflöte(1));
        System.out.println(o.playAll());
    }
}
