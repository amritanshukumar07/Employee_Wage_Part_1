import java.util.Random;

public class EmployeeWage {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HOURS = 100;

    public static void EmployeeWageCalculator(){
        int totalHours=0;
        int totalDays=0;
        int totalWage=0;

        Random random= new Random();
        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            int workHours = getWorkHours(random.nextInt(3));
            totalHours += workHours;
            totalDays++;
            totalWage += workHours * WAGE_PER_HOUR;

        }
        System.out.println("Total Days Worked: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Monthly Wage: " + totalWage);
    }
    public static int getWorkHours(int empType){
        return switch (empType) {
            case 1 -> FULL_DAY_HOUR;
            case 2 -> PART_TIME_HOUR;
            default -> 0;
        };
    }
    public static void main(String [] args){
        System.out.println("Welcome to Employee wage computation");
        EmployeeWageCalculator();
    }
}
