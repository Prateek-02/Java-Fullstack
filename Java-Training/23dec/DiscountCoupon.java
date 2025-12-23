import java.util.Scanner;
public class DiscountCoupon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of unit purchased: ");
        int unit = sc.nextInt();
        int totalCost = unit*100;
        int discountCost=0;
        if(totalCost > 1000){
            discountCost = (totalCost * 10)/100;
            totalCost -= discountCost;
            System.out.println("Final cost after discount is: " + totalCost);
        }
        else{
            System.out.println("No discount applicable, final cost is: "+totalCost);
        }

        sc.close();
    }
}