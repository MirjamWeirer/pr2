package einheit3;

public class Trommel extends Instrumente {

    public Trommel (int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Trommel wird geschlagen");
        return lautstärke++;
    }
}
