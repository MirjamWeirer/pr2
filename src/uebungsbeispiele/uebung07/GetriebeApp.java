package uebungsbeispiele.uebung07;

public class GetriebeApp {
    public static void main(String[] args)  {
        Getriebe getriebe1 = new Getriebe(-1,6);

        System.out.println(getriebe1.getMinGang());

        try {
            getriebe1.gangErhöhen(1);
        } catch (GangExistiertNichtException e) {
            e.printStackTrace();
        }

        try {
            getriebe1.setGang(1);
        } catch (GetriebeSchutzException e) {
            e.printStackTrace();
        }

        System.out.println(getriebe1.getGang());
    }
}
