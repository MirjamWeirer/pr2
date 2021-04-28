package einheit3;

import java.util.ArrayList;

public class Customer extends Person{
    private int customerNumber;
    private ArrayList<Address> addresses;

    public Customer(int customerNumber, String fName, String lName){
        super(fName,lName);
        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
    }

    public void addAddress(Address a){
        this.addresses.add(a);
    }

    @Override
    public String toString() {
        return  customerNumber + " "+ firstName + " "+ lastName + " " + addresses;
    }
}
