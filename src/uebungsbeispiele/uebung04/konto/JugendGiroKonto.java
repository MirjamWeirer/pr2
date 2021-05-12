package uebungsbeispiele.uebung04.konto;

public class JugendGiroKonto extends GiroKonto{
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double buchungslimit, double limit){
        super(inhaber,limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {

        if (kontostand < limit){
            kontostand -= wert;
        }
        if (wert > buchungslimit){
            System.out.println("Keine Buchung möglich Betrag zu hoch");
            return kontostand;
        }
        return kontostand;
    }
}
