package com.corejava.layers;

import java.util.Scanner;

public class CabController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("Enter Car Id: ");
			int carId = sc.nextInt();
			
			System.out.print("Enter Car Name: ");
			String name = sc.next();
			
			System.out.print("Enter Car Price: ");
			double price = sc.nextDouble();
			
			CabService cabService = new CabService();
			int t = cabService.addCab(carId,name,price);
			
			System.out.println("CabController return value for db: "+t);
			
			sc.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
