package einheit3;

public class Querflöte extends Instrumente{

    public Querflöte (int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Die Querflöte wird leise gespielt");
        return lautstärke;
    }
}
