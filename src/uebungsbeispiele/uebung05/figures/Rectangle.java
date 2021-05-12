package uebungsbeispiele.uebung05.figures;

public class Rectangle extends Figure{
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length * length + width * width;
    }
}
