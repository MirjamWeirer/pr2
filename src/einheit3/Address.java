package einheit3;

public class Address {
    private String street;
    private String zip;
    private String city;
    private String country;

    public Address(String street, String zip,String city, String country){
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return  street + ", " + zip + ", " + city + ", " + country;
    }
}
