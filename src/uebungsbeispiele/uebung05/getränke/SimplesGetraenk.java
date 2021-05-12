package uebungsbeispiele.uebung05.getränke;

public class SimplesGetraenk extends Getraenk {

    protected Fluessigkeit bestandteil;

    public SimplesGetraenk(String name, Fluessigkeit bestandteil){
        super(name);
        this.bestandteil = bestandteil;
    }

    @Override
    public boolean brennt() {
        if (bestandteil.getAlkoholProzent() > 30){
            return true;
        }
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return 1;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if (bestandteil.getAlkoholProzent() > 0){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        double ml = bestandteil.getMenge();
        return ml;
    }

    @Override
    public int compareTo(Getraenk o) {
        return 0;
    }


}
