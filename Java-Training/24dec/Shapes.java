import java.util.Scanner;

public class Shapes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        String pref = "";
        do{
            System.out.println("1.Circle\n2.Rectangle\n3.Square");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                
                case 1:
                    double area1 = circle();
                    System.out.println("Area of circle is: "+area1);
                    break;
                case 2:
                    double area2 = rectangle();
                    System.out.println("Area of rectangle is: "+area2);
                    break;
                case 3:
                    double area3 = square();
                    System.out.println("Area of square is: "+area3);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.print("Do you want to continue: ");
            pref = sc.next();
        }
        while(pref.equals("yes"));
        
    }

    public static double circle(){
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        double area = 3.14*r*r;
        return area;
    }
    public static double rectangle(){
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        double area = l*b;
        return area;
    }
    public static double square(){
        System.out.print("Enter Side: ");
        int s = sc.nextInt();
        double area = s*s;
        return area;
    }

}
