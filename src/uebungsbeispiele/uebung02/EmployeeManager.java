package uebungsbeispiele.uebung02;

import java.util.*;

public class EmployeeManager {
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmploy(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        //if (number == employees)
        return null;
    }


    public String findByDepartment(String department) {
        if (employees.contains(department))
            return department;
        return null;
    }

      /*public Employee findByMaxSalary(){
        double temp = 0;
          for (int i = 0; i < employees.size();i++) {
              //if ()
          }
          return Employee;
      }

       */

}
