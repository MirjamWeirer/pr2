package einheit3;

public class WeihnachtsHase extends Hase{

    public WeihnachtsHase(String name){
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println(name +" verteilt Geschenke");
    }

    @Override
    public void hoppeln() {
        System.out.println(name +" hoppelt durch Schnee");
    }
}
