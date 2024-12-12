import java.util.Random;

public class WorkHourSwitchCase {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("UC4: Calculate Daily Wage Using Switch Case");
        Random random = new Random();
        int empType = random.nextInt(3);

        int workHours = getWorkHours(empType);
        int dailyWage = workHours * WAGE_PER_HOUR;

        System.out.println("Daily Wage (Using Switch Case): " + dailyWage);
    }

    private static int getWorkHours(int empType) {
        switch (empType) {
            case 1: return FULL_DAY_HOUR;
            case 2: return PART_TIME_HOUR;
            default: return 0;
        }
    }
}
