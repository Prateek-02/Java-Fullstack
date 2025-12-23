import java.util.Scanner;

public class examResultClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if(marks >= 40){
            System.out.println("Pass");
            if(marks >= 80){
                System.out.println("Grade is: A");
            }
            else if(marks >= 60 && marks < 79){
                System.out.println("Grade is: B");
            }
        }
        else{
            System.out.println("Fail");
        }

        sc.close();
    }
}
