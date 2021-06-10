package com.bridgelabz.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFilesIOService {
    public static String PAYROLL_FILE_NAME = "Payroll.text";
    public void writeData(List<EmployeeData> employeeDataList) {
        StringBuffer buffer = new StringBuffer();
        employeeDataList.forEach(emp -> {
            String empDataString = emp.toString().concat("\n");
            buffer.append(empDataString);
        });

        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), buffer.toString().getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
