package uebungsbeispiele.uebung04.konto;

public class SparKonto extends Konto{
    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if (kontostand < wert){
            System.out.println("Sparkonto darf nicht überzogen werden");
        }else {
            kontostand -= wert;
        }
        return kontostand;
    }
}
