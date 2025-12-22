import java.util.Scanner;

public class onlineCourseAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is course expired: ");
        boolean courseExpired = sc.nextBoolean();

        if(!courseExpired){
            System.out.print("Does student has paid for the course: ");
            boolean isCoursePaid = sc.nextBoolean();

            System.out.print("Does student has a Scholarship: ");
            boolean hasScholarship = sc.nextBoolean();

            if(isCoursePaid  || hasScholarship){
                System.out.println("Student can access the course");
            }
            else{
                System.out.println("Student cannot access the course");
            }
        }
        else{
            System.out.println("Course is expired");
        }

        sc.close();
    }
}
