package uebungsbeispiele.uebung04.tier;

public class Cat extends Animal{
    protected String name;

    public Cat(String n, String color, int countEyes){
        super(color,countEyes);
        name = n;
    }

    @Override
    public void walk() {
        System.out.println("Cat " + name + " schleicht");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat " + name + " miaut");
    }
}
