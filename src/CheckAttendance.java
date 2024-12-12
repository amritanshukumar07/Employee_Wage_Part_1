import java.util.Random;

public class CheckAttendance {
    public static void main(String [] args){
        System.out.println("Computing Employee attendance");
        Random random = new Random();
        int isPresent= random.nextInt(2);

        if(isPresent==0){
            System.out.println("Employee is Absent");
        }
        else
            System.out.println("Employee is present");
    }
}
