import com.bridgelabz.fileio.EmployeeData;
import com.bridgelabz.fileio.EmployeePayroll;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrolltest {
    @Test
    public void givenEmployess_WhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeeData[] arrayOfEmps = {
                new EmployeeData(1, "Harshit", 1000),
                new EmployeeData(2,"Jadon",2000),
                new EmployeeData(3,"Noida",3000),
        };
        EmployeePayroll employeePayroll = new EmployeePayroll(Arrays.asList(arrayOfEmps));
        employeePayroll.writeEmployeeData(EmployeePayroll.IOService.FILE_IO);

    }
}
