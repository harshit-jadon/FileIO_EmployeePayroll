package com.bridgelabz.fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {
    List<EmployeeData> employeeData;

    public EmployeePayroll(List<EmployeeData> employeeData) {
        this.employeeData = employeeData;
    }
    public void readEmployeeData(Scanner consoleInputReader){
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary");
        double salary = consoleInputReader.nextInt();
        employeeData.add(new EmployeeData(id, name, salary));
    }
    public void writeEmployeeData(){
        System.out.println("\nWriting Employee Payroll to Console\n" +employeeData);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll");
        ArrayList<EmployeeData> employeeData = new ArrayList<>();
        EmployeePayroll employeePayroll = new EmployeePayroll(employeeData);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayroll.readEmployeeData(consoleInputReader);
        employeePayroll.writeEmployeeData();
    }
}
