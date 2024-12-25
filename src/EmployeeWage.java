
public class EmployeeWage {

    public static void main(String [] args){
        System.out.println("Welcome to Employee wage builder for different companies");
        EmployeeWageBuilder builder= new EmployeeWageBuilder();
        builder.addCompany("GE Vernova",20,20,100,8,4);
        builder.addCompany("GE Health",30,20,100,8,4);
        builder.calculateWages();
        for(Company company: builder.companies){
            System.out.println("Total Wage of Company "+company.name+" : " + company.totalWage);
        }
    }
}
