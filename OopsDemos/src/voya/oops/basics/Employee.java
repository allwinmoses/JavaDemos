package voya.oops.basics;

public class Employee {


    String employeeName;
    int employeeId;
    double salary;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    boolean getDetails(){
        System.out.println("Name "+employeeName);
        System.out.println("EmployeeId "+employeeId);
        System.out.println("Salary "+salary);
        return false;

    }








    }
