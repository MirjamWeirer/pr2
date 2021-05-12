package uebungsbeispiele.uebung01;

public class Article {
    private String name;
    private int number;
    private double price;

    public Article(String name, int number, double price){
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumber (int number){
        this.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name = " + name + " Menge = " + number + " price = " + price +
                '}';
    }
}
