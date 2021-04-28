package einheit4;

public class Car extends LogisticManager implements  Moveable{
    protected String type;
    protected String color;
    protected double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(color + " "+ type + " will be moved to " + destination);
    }
}
