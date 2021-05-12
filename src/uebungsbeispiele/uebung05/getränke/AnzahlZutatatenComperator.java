package uebungsbeispiele.uebung05.getränke;

public abstract class AnzahlZutatatenComperator implements Comparable<Getraenk> {

    Getraenk get = new Getraenk("...") {
        @Override
        public int getAnzahlZutaten() {
            return 0;
        }

        @Override
        public boolean beinhaltetAlkohol() {
            return false;
        }

        @Override
        public double mengeInMl() {
            return 0;
        }

        @Override
        public boolean brennt() {
            return false;
        }


        @Override
        public int compareTo(Getraenk o) {
            if (this.getAnzahlZutaten() < o.getAnzahlZutaten()) {
                return -1;
            }
            if (this.getAnzahlZutaten() > o.getAnzahlZutaten()) {
                return 1;
            }
            return 0;

        }
    };

    public int compareTo() {
        return compareTo();
    }

    @Override
    public int compareTo(Getraenk o) {
        return 0;
    }
}
