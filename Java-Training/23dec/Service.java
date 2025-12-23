import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);

        if(gender == 'F'){
            System.out.println("She will work only in urban areas");
        }
        else if(gender == 'M'){
            if(age > 20 && age <= 40){
                System.out.println("He may work anywhere");
            }
            else if(age > 40 && age <= 60){
                System.out.println("He will work in urban areas only");
            }
            else{
                System.out.println("Error");
            }
        }

        sc.close();
        
    }  
}
