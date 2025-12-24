import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        String ans = details();
        System.out.println("Details: \n"+ans);
        
    }

    public static String details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.close();
        return "Name: "+name+"\nAge: "+age;
        




    }
}
