package uebungsbeispiele.uebung04.konto;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber){
        this.inhaber = inhaber;
        kontostand = 0;
    }

    public void einzahlen(double wert){
        kontostand += wert;
    }

    public double auszahlen(double wert){
        kontostand -= wert;
        return wert;
    }
}
