package uebungsbeispiele.uebung04.mitarbeiterin;

import java.util.ArrayList;
import java.util.HashMap;

public class EmbolyeeManager {
    protected ArrayList<Embloyee> empList;

    public EmbolyeeManager(){
        empList = new ArrayList<>();
    }

    public double calcTotalSalary(){
        double result = 0;
        for (Embloyee e : empList){
            result = result + e.getFullSalary();
        }
        return result;
    }

    public void addEmployee(Embloyee e){
        empList.add(e);
    }

    public HashMap<String,Double>getSalaryByDepartment(){
        HashMap<String,Double> employee = new HashMap<>();
        for (Embloyee e : empList){
            employee.put(e.department, e.getFullSalary());
        }
        return employee;
    }
}
