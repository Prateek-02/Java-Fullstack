import java.util.Scanner;

public class LoanEligibiltyChecker {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter current loan applictions: ");
        int loanApp = sc.nextInt();
        if (loanApp > 9) {
            System.out.println("You have exceeded you loan application limit");
        } 
        else {
            System.out.print("Enter monthly income: ");
            double monthlyIncome = sc.nextDouble();
            System.out.print("Enter credit score: ");
            int creditScore = sc.nextInt();
            System.out.print("Enter loan amount: ");
            double loanAmount = sc.nextDouble();

            String status = isEligible(monthlyIncome, creditScore, loanAmount);
            System.out.println("Elgibility: " + status);
        }
        
    }

    public static String isEligible(double monthlyIncome, int creditScore, double loanAmount) {
        boolean eligibility = false;
        if (monthlyIncome >= 100000) {
            if (creditScore >= 700 && loanAmount <= 1500000) {
                eligibility = true;
            } 
            else if ((creditScore >= 500 && creditScore < 700) && loanAmount <= 1000000) {
                eligibility = true;
            }

        } 
        else if (monthlyIncome >= 80000 && monthlyIncome < 100000) {
            if (creditScore >= 700 && loanAmount <= 1000000) {
                eligibility = true;
            } 
            else if ((creditScore >= 500 && creditScore < 700) && loanAmount <= 800000) {
                eligibility = true;
            } 
        } 
        else if (monthlyIncome >= 50000 && monthlyIncome < 80000) {
            if (creditScore >= 700 && loanAmount <= 800000) {
                eligibility = true;
            } 
            else if ((creditScore >= 500 && creditScore < 700) && loanAmount <= 600000) {
                eligibility = true;
            } 
        } 
        else if (monthlyIncome >= 30000 && monthlyIncome < 50000) {
            if (creditScore >= 700 && loanAmount <= 600000) {
                eligibility = true;
            } 
            else if (creditScore < 700 && loanAmount <= 400000) {
                eligibility = true;
            } 
        } 

        if(!eligibility){
            return "Not eligible based on income,credit score or loan amount";
        }

        System.out.print("Enter annual rate: ");
        double annualRate = sc.nextDouble();
        System.out.print("Enter tenure: ");
        int tenureMonths = sc.nextInt();   


        double r = annualRate / 12 / 100;
        double emi = (loanAmount * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
        System.out.println("Emi is: "+emi);
        double maxEmiAllowed = monthlyIncome*0.30;

        if(emi > maxEmiAllowed){
            return "Not eligible due to high EMI burden";
        }
        else{
            return "Eligible for loan";
        }

    }
}
