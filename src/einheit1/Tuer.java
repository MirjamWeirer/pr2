package einheit1;

public class Tuer {
    private int breite;
    private int höhe;
    private Himmelsrichtung richtung;

    public Tuer(int breite,int höhe){
        this.breite = breite;
        this.höhe = höhe;
    }

    public void setRichtung(Himmelsrichtung richtung) {
        this.richtung = richtung;
    }

    public Himmelsrichtung getRichtung() {
        return richtung;
    }

    public int getHöhe() {
        return höhe;
    }
    public int getBreite(){
        return breite;
    }
}
