package uebungsbeispiele.uebung04.tier;

public abstract class Animal {
    protected String color;
    protected int countEyes;

    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

    public void winkeWinke(){
        System.out.println("Winke winke");
    }

    public abstract void walk();

    public abstract void makeNoise();

}
