package uebungsbeispiele.uebung02;

import java.util.Objects;

public class Employee {
    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber);
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
