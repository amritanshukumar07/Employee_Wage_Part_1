public class MonthlyWageCalculation {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("UC5: Calculate Monthly Wage");
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        int monthlyWage = dailyWage * WORKING_DAYS;

        System.out.println("Monthly Wage: " + monthlyWage);
    }
}
