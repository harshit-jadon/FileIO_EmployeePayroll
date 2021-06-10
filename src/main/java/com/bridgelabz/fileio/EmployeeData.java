package com.bridgelabz.fileio;

public class EmployeeData {
    int id;
    String name;
    double salary;

    public EmployeeData(int id,String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
