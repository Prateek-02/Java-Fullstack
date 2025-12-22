import java.util.Scanner;

public class employeeAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter working hour: ");
        int workingHour = sc.nextInt();

        if(workingHour > 8){
            System.out.println("Present");
        }
        else if(workingHour >= 4  && workingHour <= 8){
            System.out.println("Half-Day");
        }
        else{
            System.out.println("Absent");
        }

        sc.close();
    }
}
