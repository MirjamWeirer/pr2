package einheit5;

public class EScooter implements RentAirBnB{
    protected double distance;
    public EScooter(double d){
        distance = d;
    }

    @Override
    public double rentAirBnB(int days) {
        return 20 * days;
    }
}
