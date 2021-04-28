package einheit5;

//House derives from Property
//additional attributes:
//yearBuilt: the year in which the house was finished
public class House extends Property implements RentAirBnB {
    protected int yearBuilt;

    public House(String owner, double sizeInM2, String address, int yearBuilt) {
        super(owner, sizeInM2, address);
        this.yearBuilt = yearBuilt;
    }

    //for houses built after 2010 m2 price is 4000
    //for houses built between 1950 and including 2010 price is 2000
    //for older houses price is 3000
    @Override
    public double upfrontCost() {
        double price = 0;
        if (yearBuilt > 2010){
            price = sizeInM2 * 4000;
        } else if (yearBuilt > 1950 && yearBuilt <= 2010){
            price = sizeInM2 * 2000;
        } else {
            price = sizeInM2 * 3000;
        }
        return price;
    }

    //for houses after 2015 cost is m2 / 2
    //houses between 1990 and 2015 m2 * 2.5
    //houses before 1990 m2 * 5
    @Override
    public double monthlyCost() {
        double price = 0;
        if (yearBuilt > 2015){
            price = sizeInM2 / 2.0;
        } else if (yearBuilt > 1990 && yearBuilt <= 2015){
            price = sizeInM2 * 2.5;
        } else {
            price = sizeInM2 * 5;
        }
        return price;
    }

    //m2 price per day
    @Override
    public double rentAirBnB(int days) {
        return sizeInM2 * days;
    }
}
