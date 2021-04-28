package uebungsbeispiele.uebung04.tier;

public class Dog extends Animal{
    protected String name;
    public Dog(String name, String color, int countEyes){
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk(){
        System.out.println("Dog "+name + " geht");
    }
    @Override
    public void makeNoise(){
        System.out.println("Dog " +name + " bellt");
    }
}
