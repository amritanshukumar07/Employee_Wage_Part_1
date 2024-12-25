import java.util.List;

public interface EmployeeWageBuilderInterface {
    void addCompany(String name,int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours);
    void calculateWages();
}
