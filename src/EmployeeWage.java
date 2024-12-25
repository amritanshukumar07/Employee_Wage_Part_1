import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EmployeeWage {
//    private static final int WAGE_PER_HOUR = 20;
//    private static final int FULL_DAY_HOUR = 8;
//    private static final int PART_TIME_HOUR = 4;
//    private static final int MAX_WORKING_DAYS = 20;
//    private static final int MAX_WORKING_HOURS = 100;
    public static Map<String,Integer> companyWage = new HashMap<>();
    public static void EmployeeWageCalculator( String companyName, int WAGE_PER_HOUR,int MAX_WORKING_DAYS,int MAX_WORKING_HOURS,int FULL_DAY_HOUR,int PART_TIME_HOUR){
        int totalHours=0;
        int totalDays=0;
        int totalWage=0;

        Random random= new Random();
        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            int workHours = getWorkHours(random.nextInt(3),FULL_DAY_HOUR,PART_TIME_HOUR);
            totalHours += workHours;
            totalDays++;
            totalWage += workHours * WAGE_PER_HOUR;

        }
        System.out.println("Employee Wage Calculation for Company: "+companyName);
        System.out.println("Total Days Worked: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Monthly Wage: " + totalWage);
        companyWage.put(companyName,totalWage);
    }
    public static int getWorkHours(int empType,int FULL_DAY_HOUR,int PART_TIME_HOUR){
        return switch (empType) {
            case 1 -> FULL_DAY_HOUR;
            case 2 -> PART_TIME_HOUR;
            default -> 0;
        };
    }
    public static void displayAll(){
        System.out.println("Company Wages : "+companyWage);
    }
    public static void main(String [] args){
        System.out.println("Welcome to Employee wage computation for different companies");
        EmployeeWageCalculator("GE Vernova",20,20,100,8,4);
        EmployeeWageCalculator("GE Health",30,20,100,8,4);
        displayAll();
    }
}
