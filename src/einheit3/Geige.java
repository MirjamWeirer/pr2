package einheit3;

public class Geige extends Instrumente{

    public Geige (int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Geige wird gestrichen");
        return lautstärke++;
    }
}
