package uebungsbeispiele.uebung04.tier;

public class Lion extends Animal{
    public Lion (String color, int countEyes){
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Der Löwe schleicht sich an.");
    }

    @Override
    public void makeNoise(){
        System.out.println("cough cough");
    }

    public void roar(){
        System.out.println("rooooooooooooaaaaaaaaaaaaarrrrrrrrrrr");
    }
}
