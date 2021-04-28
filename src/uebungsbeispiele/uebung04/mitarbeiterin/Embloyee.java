package uebungsbeispiele.uebung04.mitarbeiterin;

public class Embloyee {
    protected String lastname;
    protected String firstname;
    protected String department;
    protected double baseSalary;

    public Embloyee(String lname, String fname, String d, double baseSalary){
        lastname = lname;
        firstname = fname;
        department = d;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return baseSalary;
    }
}
