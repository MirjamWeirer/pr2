package einheit5;

//RentedFlat derives from Property
//additional attributes:
//kitchenIncluded: true if kitchen in flat, otherwise false
public class RentedFlat extends Flat {
    protected boolean kitchenIncluded;

    public RentedFlat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory, boolean kitchenIncluded) {
        super(owner, sizeInM2, address, furnished, flatCategory);
        this.kitchenIncluded = kitchenIncluded;
    }
    //here we war no longer obliged to implement the abstract methods
    //we can overwrite if we want but we don't have to

    //for flat category 1 price 3 times monthly rent (including everything)
    //category 2 we pay 2 times monthly rent
    //category 3 we pay 1.5 times monthly rent
    @Override
    public double upfrontCost() {
        double price = 0;
        if (flatCategory == 1) {
            price = monthlyCost() * 3;
        } else if (flatCategory == 2) {
            price = monthlyCost() * 2;
        } else {
            price = monthlyCost() * 1.5;
        }
        return price;
    }

    //category1: m2 * 18; for kitchen extra 70
    //category2: m2 * 10; for kitchen extra 40
    //category3: m2 * 7; for kitchen extra 15
    @Override
    public double monthlyCost() {
        double price = 0;
        if (flatCategory == 1) {
            price = sizeInM2 * 18;
            if (kitchenIncluded) {
                price += 70;
            }
        } else {
            if (flatCategory == 2) {
                price = sizeInM2 * 10;
                if (flatCategory == 2) {
                    price += 40;
                } else {
                    if (flatCategory == 3) {
                        price = sizeInM2 * 7;
                        if (kitchenIncluded) {
                            price += 15;
                        }
                    }
                }
            }
        }
        return price;
    }
        @Override
        public double rentAirBnB ( int days){
            return 0; // because we are not allowed
        }
    }
