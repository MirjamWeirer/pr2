package uebungsbeispiele.uebung04.konto;

public class KontoDemo {
    public static void main(String[] args) {
        Konto k = new Konto("Miri");
        GiroKonto gk = new GiroKonto("Steff",1000);
        JugendGiroKonto jgk = new JugendGiroKonto("Emily",100,1000);
        SparKonto sk = new SparKonto("Jasi");

        k.einzahlen(1000);
        System.out.println(k.inhaber + " " + k.kontostand);
        k.auszahlen(350.5);
        System.out.println(k.inhaber + " " + k.kontostand);
        gk.einzahlen(500);
        System.out.println(gk.inhaber + " " + gk.kontostand);
        gk.auszahlen(500.5);
        System.out.println(gk.inhaber + " " + gk.kontostand);
        jgk.einzahlen(300);
        System.out.println(jgk.inhaber + " " + jgk.kontostand);
        jgk.auszahlen(50);
        System.out.println(jgk.inhaber + " " + jgk.kontostand);
        jgk.auszahlen(150);
        System.out.println(jgk.inhaber + " " + jgk.kontostand);
        sk.einzahlen(1599);
        System.out.println(sk.inhaber + " " + sk.kontostand);
        sk.auszahlen(399);
        System.out.println(sk.inhaber + " " + sk.kontostand);

        GiroKonto giro = jgk;
        giro.einzahlen(400);
        System.out.println(giro.inhaber + " "+ giro.kontostand);
    }
}
