import java.util.Scanner;
public class Calc {
    static Scanner sc = new Scanner(System.in);   //Scanner created globally(we have to use static keyword)
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter type of operation: ");
        String type = sc.next();
        if(type.equals("add")){
            add();
        }
        else if(type.equals("sub")){
            sub();
        }
        else if(type.equals("mul")){
            mul();
        }
        else{
            System.out.println("Invalid Choice");
        }
       
        sc.close(); //closing once when all the functions are executed
    }

    public static void add(){
        // Scanner sc = new Scanner(System.in); if we create scanner class inside main method then we have to create scanner class in each method

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int res = num1+num2;
        System.out.println("Sum is: "+res);
        
    }

    public static void sub(){
        // Scanner sc = new Scanner(System.in); if we create scanner class inside main method then we have to create scanner class in each method

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int res = num1-num2;
        System.out.println("Difference is: "+res);
       
    }

    public static void mul(){
        // Scanner sc = new Scanner(System.in);  if we create scanner class inside main method then we have to create scanner class in each method
        
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int res = num1*num2;
        System.out.println("Product is: "+res);
    }
}
