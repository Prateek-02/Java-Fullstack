package com.corejava.layers;

import java.util.Scanner;

public class CabController {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int choice = 0;
		CabService cabService = new CabService();
		int result = 0;
		do {
			
			System.out.println("-- Cab Booking --");
			System.out.println("1. Insert");
			System.out.println("2. Show");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			
			System.out.print("Enter operation choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				try{
					System.out.print("Enter Cab Id: ");
					int carId = sc.nextInt();
					
					System.out.print("Enter Cab Name: ");
					String name = sc.next();
					
					System.out.print("Enter Cab Price: ");
					double price = sc.nextDouble();
					
					result = cabService.addCab(carId,name,price);
					
					System.out.println("Record Inserted: "+result);
					
					sc.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 2:
				System.out.print("Enter Cab id to fetch: ");
				int fetchId = sc.nextInt();
				
				CabBean cb = cabService.loadCab(fetchId);
				
				if(cb != null) {
					System.out.println("Cab Id: " + cb.getCarId());
					System.out.println("Cab Name: " + cb.getName());
					System.out.println("Cab Price: " + cb.getPrice());
					System.out.println("Cab Category: " + cb.getCategory());
				}
				else {
					System.out.println("No user found");
				}
				break;
				
			case 3:
				System.out.print("Enter Cab id to update: ");
				int updateId = sc.nextInt();
				
				sc.nextLine();
				System.out.print("Enter New Name: ");
				String newname = sc.nextLine();
				
				result = cabService.updateCab(updateId , newname);
				
				System.out.println("Record Updated: "+result);
				
				break;
			case 4:
				System.out.print("Enter Cab id to delete: ");
				int delId = sc.nextInt();
				
				result = cabService.deleteCab(delId);
				
				System.out.println("Record Deleted: "+result);
				break;
			case 5:
				System.out.println("Exiting....");
				flag = false;
				break;
			default:
				System.out.println("Please Enter a valid choice");
				break;
			}
			
		}while(flag);
	}

}
