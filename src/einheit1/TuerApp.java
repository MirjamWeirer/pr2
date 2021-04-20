package einheit1;

public class TuerApp {
    public static void main(String[] args) {
        Tuer tuer1=new Tuer(50,100);
        tuer1.setRichtung(Himmelsrichtung.WESTEN);
        System.out.println(tuer1.getRichtung());

        System.out.println(tuer1.getHöhe());

        System.out.println(tuer1.getBreite());
    }
}
