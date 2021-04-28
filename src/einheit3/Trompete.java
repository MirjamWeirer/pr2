package einheit3;

public class Trompete extends Instrumente{

    public  Trompete(int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Trompete wird geblasen");
        return lautstärke ++;
    }
}
