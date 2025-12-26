import java.util.Scanner;

public class ExamResultAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks of subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks of subject 3: ");
        int m3 = sc.nextInt();

        char grade = calcGrade(m1,m2,m3);
        if(grade == 'F'){
            System.out.println("Grade is: "+grade);
            System.out.println("Not elegible for placement");
        }
        else{
            System.out.println("Grade is: "+grade);
            System.out.println("Eligible for placement");
        }
        sc.close();
    }

    public static char calcGrade(int m1,int m2,int m3){
        int totalMarks = (m1+m2+m3)/3;

        if(totalMarks >= 90){
            System.out.println("Marks is: "+totalMarks);
            return 'A';
        }
        else if(totalMarks >= 80 && totalMarks < 90){
            System.out.println("Marks is: "+totalMarks);
            return 'B';
        }
        else if(totalMarks >= 70 && totalMarks < 79){
            System.out.println("Marks is: "+totalMarks);
            return 'C';
        }
        else{
            return 'F';
        }
        

    }
}
