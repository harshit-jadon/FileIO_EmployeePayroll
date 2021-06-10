package com.bridgelabz.fileio;

public class EmployeeData {
    String name;
    int id, salary;

    public EmployeeData(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "EmployeeData{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
