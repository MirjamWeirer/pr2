package uebungsbeispiele.uebung04.tier;

public class Bird extends Animal implements Fly{
    public Bird(String colour){
        super(colour,2);//i assume every bird has 2 eyes,so it is no parameters for countEyes
    }

    @Override
    public void walk() {
        System.out.println("running around");
    }

    @Override
    public void makeNoise() {
        System.out.println("Piep piep");
    }

    @Override
    public void fly() {
        System.out.println("Fly through the sky");
    }
}
