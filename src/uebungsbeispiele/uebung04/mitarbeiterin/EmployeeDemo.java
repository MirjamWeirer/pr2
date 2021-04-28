package uebungsbeispiele.uebung04.mitarbeiterin;

public class EmployeeDemo {
    public static void main(String[] args) {
        FixComissionEmployee miri = new FixComissionEmployee("Weirer","Mirjam","Graz",2000.00, 300);
        PercentCommisionEmployee jasi = new PercentCommisionEmployee("Feigel","Jasmin", "Graz", 2000,10);
        FixComissionEmployee petra = new FixComissionEmployee("Weirer","Petra","Wien",2000.00, 200);
        PercentCommisionEmployee tim = new PercentCommisionEmployee("Feigel","Tim", "Wien", 2000,5);
        EmbolyeeManager e = new EmbolyeeManager();
        miri.getFullSalary();
        jasi.getFullSalary();
        petra.getFullSalary();
        tim.getFullSalary();
        e.addEmployee(miri);
        e.addEmployee(jasi);
        e.addEmployee(tim);
        e.addEmployee(petra);
        System.out.println(miri.getFullSalary());
        System.out.println(e.getSalaryByDepartment());
    }
}
