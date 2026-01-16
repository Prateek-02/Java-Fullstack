package TypeCasting;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Ola Cab Booking...");

		System.out.print("Enter your name: ");
		String username = sc.next();
		System.out.print("Enter contact number: ");
		long contact = sc.nextLong();
		System.out.print("Enter ac Bal: ");
		double acBal = sc.nextDouble();


		Ola ola = new Ola(username,contact,acBal);
		boolean isLoggedIn = ola.login(username,contact);
		

		int choice = 0;
		String preference;
		if(isLoggedIn){
			System.out.println("User Logged in");

			do{
				sc.nextLine();
				System.out.print("Enter pickup location: ");
				String pickup = sc.nextLine();

				System.out.print("Enter drop location: ");
				String drop = sc.nextLine();

				System.out.print("Enter choice: ");
				
				System.out.println();
				System.out.println("1. Book Mini");
				System.out.println("2. Book Prime");
				System.out.println("3. Book Luxury");

				choice = sc.nextInt();
				switch(choice){
					case 1: 
						ola = new Mini(username,contact,acBal,pickup,drop,10.0,120.0);
						if(ola instanceof Mini){
							Mini m = (Mini) ola;
							m.bookCab(pickup,drop);
							m.displayDetails();
							System.out.print("Do you want to end the ride?: ");
							sc.nextLine();
							String decision = sc.nextLine();
							if(decision.equals("yes")){
								m.cancelRide();
								System.exit(0);
							}
						}
						break;

					case 2:
						ola = new Prime(username,contact,acBal,pickup,drop,10.0,150.0);
						if(ola instanceof Prime){
							Prime p = (Prime) ola;
							p.bookCab(pickup,drop);
							p.displayDetails();
							sc.nextLine();
							String decision = sc.nextLine();
							if(decision.equals("yes")){
								p.cancelRide();
								System.exit(0);
							}
						}
						break;

					case 3:
						ola = new Luxury(username,contact,acBal,pickup,drop,10.0,220.0);
						if(ola instanceof Luxury){
							Luxury l = (Luxury) ola;
							l.bookCab(pickup,drop);
							l.displayDetails();
							sc.nextLine();
							String decision = sc.nextLine();
							if(decision.equals("yes")){
								l.cancelRide();
								System.exit(0);
							}
						}
						break;

					default:
						System.out.println("Enter a valid choice");
						break;	
				}
				System.out.print("Do you want to continue?: ");
				preference = sc.next();
			}
			while(preference.equals("yes"));
		}
		else{
			System.out.println("Login Failed");
		}

		sc.close();
		
    }
}

class Ola{
	public String username;
	public long contactNum;
	private double accountBal;
	
	Ola(String username, long contactNum, double accountBal){
		this.username = username;
        this.contactNum = contactNum;
        this.accountBal = accountBal;
	}
	
	public boolean login(String username, long contactNum) {
		return this.username.equals(username) && this.contactNum == contactNum;
	}

	public String getName(){
		return username;
	}

	public long getNum(){
		return contactNum;
	}

	public double getacBal(){
		return accountBal;
	}

	
}

class Mini extends Ola{
	private String pickUp;
	private String drop;
	private double pkm;
	private double price;
	Ola ola;

	Mini(String username,long contactNum,double accountBal,String pickUp,String drop,double pkm, double price){
		super(username,contactNum,accountBal);
		this.pickUp = pickUp;
		this.drop = drop;
		this.pkm = pkm;
		this.price = price;
	}

	public void bookCab(String pickUp,String drop){
		System.out.println("\nBooking details: ");
		System.out.println("Mini Cab Booked...");
		System.out.println("Pick up location: "+pickUp);
		System.out.println("Drop up location: "+drop);
	}

	public void displayDetails(){
		System.out.println("\nUser details: ");
		System.out.println("Username: "+getName());
		System.out.println("Contact Number: "+getNum());
		System.out.println("Cost Per Km: "+pkm);
		System.out.println("Total Price: "+price);

	}

	public void cancelRide(){
		ola = null;
		System.out.println("Ride cancelled");
	}
}

class Prime extends Ola{
	private String pickUp;
	private double pkm;
	private String drop;
	private double price;
	Ola ola;

	Prime(String username,long contactNum,double accountBal,String pickUp,String drop,double pkm, double price){
		super(username,contactNum,accountBal);
		this.pickUp = pickUp;
		this.drop = drop;
		this.pkm = pkm;
		this.price = price;
	}


	public void bookCab(String pickUp,String drop){
		System.out.println("\nBooking details: ");
		System.out.println("Prime Cab Booked...");
		System.out.println("Pick up location: "+pickUp);
		System.out.println("Drop up location: "+drop);
	}

	public void displayDetails(){
		System.out.println("\nUser details: ");
		System.out.println("Username: "+getName());
		System.out.println("Contact Number: "+getNum());
		System.out.println("Cost Per Km: "+pkm);
		System.out.println("Total Price: "+price);
	}

	public void cancelRide(){
		ola = null;
		System.out.println("Ride cancelled");
	}

}

class Luxury extends Ola{
	private String pickUp;
	private String drop;
	private double pkm;
	private double price;
	Ola ola;

	Luxury(String username,long contactNum,double accountBal,String pickUp,String drop,double pkm, double price){
		super(username,contactNum,accountBal);
		this.pickUp = pickUp;
		this.drop = drop;
		this.pkm = pkm;
		this.price = price;
	}


	public void bookCab(String pickUp,String drop){
		System.out.println("\nBooking details: ");
		System.out.println("Luxury Cab Booked...");
		System.out.println("Pick up location: "+pickUp);
		System.out.println("Drop up location: "+drop);
	}

	public void displayDetails(){
		System.out.println("\nUser details: ");
		System.out.println("Username: "+getName());
		System.out.println("Contact Number: "+getNum());
		System.out.println("Cost Per Km: "+pkm);
		System.out.println("Total Price: "+price);
	}

	public void cancelRide(){
		ola = null;
		System.out.println("Ride cancelled");
	}
}

