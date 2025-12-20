public class Q12 {
    public static void main(String[] args) {
        double principalAmount = 500000;
        double rate = 10.0;
        double time = 5.0;
        double totalMonths = time * 12;
        double SI = (principalAmount * rate * time)/100;
        double Emi = (principalAmount+SI)/totalMonths;
        double totalAmount = principalAmount+SI;

        System.out.println("Principal amount is: "+principalAmount);
        System.out.println("Yearly Interest rate: "+rate);
        System.out.println("TotalSimple Interest: "+SI);
        System.out.println("Monthly Emi: "+Emi);
        System.out.println("Total amount paid "+totalAmount);
  


    }
}
