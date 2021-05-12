package uebungsbeispiele.uebung05.getränke;

public class LongDrink extends Getraenk {
    protected Fluessigkeit spirtuose;
    protected Fluessigkeit filler;
    public LongDrink(String name, Fluessigkeit spirtuose, Fluessigkeit filler) {
        super(name);
        this.spirtuose = spirtuose;
        this.filler = filler;
    }

    @Override
    public boolean brennt() {
        if (spirtuose.getAlkoholProzent() > 30 || filler.getAlkoholProzent() > 30){
            return true;
        }
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return 2;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if (spirtuose.getAlkoholProzent() > 0 || filler.getAlkoholProzent() > 0){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        double result = spirtuose.getMenge() + filler.getMenge();
        return result;
    }

    @Override
    public int compareTo(Getraenk o) {
        return 0;
    }
}
