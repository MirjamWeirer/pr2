package einheit3;

public class OsterHase extends Hase{
    public OsterHase (String name){
        super(name);
        //hoppeln();//would call my own hoppeln in line 13
        //super.hoppeln();//would call the implation in Hase
    }

    public void versteckeOstereier(){
        System.out.println(name +" versteckt Ostereier.");
    }
    @Override
    public void hoppeln() {
        System.out.println(name + " hoppelt und versteckt Ostereier");
    }
}
