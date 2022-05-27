package com.techelevator;

public class Employee {

    private int employeeId = 0;
    private String firstName = "";
    private String lastName = "";
    private String department = "";
    private double annualSalary = 0.0;

    public Employee(int employeeId, String firstName, String lastName, double annualSalary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this. annualSalary = annualSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void raiseSalary(double percent) {
        double raise = annualSalary * (percent / 100);
        annualSalary = annualSalary + raise;
    }

    public String getFullName(){
        String fullName = lastName + ", " + firstName;
        return fullName;
    }
}