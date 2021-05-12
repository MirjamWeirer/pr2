package uebungsbeispiele.uebung04.konto;

public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void einzahlen(double wert) {
        kontostand += wert;
    }

    @Override
    public double auszahlen(double wert) {
        kontostand -= wert;
        if (kontostand < Math.abs(limit)){
            System.out.println("Limit erreicht");
        }
        return kontostand;
    }
}
