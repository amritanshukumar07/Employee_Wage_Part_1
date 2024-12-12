import java.util.Random;

public class ConditionalWageCalculation {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("UC6: Calculate Wages with Max Conditions");

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        Random random = new Random();
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

    private static int getWorkHours(int empType) {
        switch (empType) {
            case 1: return FULL_DAY_HOUR; // Full-Time
            case 2: return PART_TIME_HOUR; // Part-Time
            default: return 0; // Absent
        }
    }
}
