package uebungsbeispiele.uebung04.mitarbeiterin;

public class PercentCommisionEmployee extends Embloyee{
    protected double percentComission;

    public PercentCommisionEmployee(String lname, String fname, String d, double baseSalery, double percentComission){
        super(lname,fname,d,baseSalery);
        this.percentComission = percentComission;
    }

    @Override
    public double getFullSalary(){
        baseSalary = baseSalary + (baseSalary * percentComission);
        return baseSalary;
    }
}
