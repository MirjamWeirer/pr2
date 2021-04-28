package einheit3;

public class Gitarre extends Instrumente{

    public Gitarre (int l){
        super(l);
    }

    @Override
    public int play() {
        int summe=0;
        summe = summe + lautstärke;
        System.out.println("Gitarre wird gezupft");
        return summe;
    }
}
