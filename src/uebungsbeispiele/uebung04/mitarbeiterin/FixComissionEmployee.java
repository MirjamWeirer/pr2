package uebungsbeispiele.uebung04.mitarbeiterin;

public class FixComissionEmployee extends Embloyee{
    protected double additionalCommision;

    public FixComissionEmployee(String lname, String fname, String d, double baseSalary, double additionalCommision){
        super(lname,fname,d, baseSalary);
        this.additionalCommision = additionalCommision;
    }

    @Override
    public double getFullSalary() {
        return baseSalary = baseSalary + additionalCommision;
    }
}

