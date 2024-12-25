public class Company {
    int wagePerHour;
    int fullDayHour;
    int partTimeHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalWage;
    String name;
    public Company(String name,int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours) {
        this.wagePerHour = wagePerHour;
        this.name= name;
        this.fullDayHour = fullDayHour;
        this.partTimeHour = partTimeHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
}
