package einheit5;
//Flat derives from Property
//additional attributes:
//furnishes: with or without furniture
//flatCategory: number between 1 and 3 specifying the flat quality 1 is the best)
public class Flat extends Property implements RentAirBnB{
    protected boolean furnished;
    protected int flatCategory; //quality of the flat

    public Flat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory) {
        super(owner, sizeInM2, address);
        this.furnished = furnished;
        this.flatCategory = flatCategory;
    }

    //for flat category 1 price is 3000 per m2
    //category 2 is 2700 per m2, category 3 is 1800 per m2
    //furnished adds 300 per m2 fpr category 1
    //in catehory 2 and 3 it just adds 5000
    @Override
    public double upfrontCost() {
        double price = 0;
        if (flatCategory == 1){
            price = sizeInM2 * 3000;
            if (furnished){
                price += 300;
            }
        } else {
            if (flatCategory == 2){
                price = sizeInM2 * 2700;
                if (furnished){
                    price += 5000;
                }
            } else {
                if (flatCategory == 3){
                    price = sizeInM2 * 1800;
                    if (furnished){
                        price += 5000;
                    }
                }

            }
        }
        return price;
    }

    //category 1 is m2 * 2 / 3
    //category 2 is m2 * 1.5
    //category 3 is m2 * 3.2
    @Override
    public double monthlyCost() {
        double price = 0;
        if (flatCategory == 1){
            price = sizeInM2 * (2/3);
        }else if (flatCategory == 2){
            price = sizeInM2 * 1.5;
        } else {
            price = sizeInM2 * 3.2;
        }
        return price;
    }

    //we want m2 / 2.0 for 1 day of rent
    @Override
    public double rentAirBnB(int days) {
        return sizeInM2 / 2.0 * days;
    }
}
