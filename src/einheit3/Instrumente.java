package einheit3;

public abstract class Instrumente {
    protected int lautstärke;

    public Instrumente (int l){
        lautstärke = l;
    }

    public abstract int play();
}
