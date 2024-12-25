import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class EmployeeWageBuilder implements EmployeeWageBuilderInterface{
    public List<Company>companies;

    public EmployeeWageBuilder(){
        companies= new ArrayList<>();

    }

    public void addCompany(String name,int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours){
        companies.add(new Company(name, wagePerHour, fullDayHour, partTimeHour, maxWorkingDays, maxWorkingHours));
    }

    public void calculateWages(){
        for( Company company:companies){
            int totalWage= calculateWageForCompany(company);
            company.totalWage=totalWage;
        }
    }
    private int calculateWageForCompany(Company company){
        int totalHours=0;
        int totalDays=0;
        int totalWage=0;

        Random random= new Random();
        while (totalHours < company.maxWorkingHours && totalDays < company.maxWorkingDays) {
            int workHours = getWorkHours(random.nextInt(3),company.fullDayHour,company.partTimeHour);
            totalHours += workHours;
            totalDays++;
            totalWage += workHours * company.wagePerHour;

        }
        return totalWage;
    }
    public static int getWorkHours(int empType,int fullDayHour,int partTimeHour){
        return switch (empType) {
            case 1 -> fullDayHour;
            case 2 -> partTimeHour;
            default -> 0;
        };
    }
}
