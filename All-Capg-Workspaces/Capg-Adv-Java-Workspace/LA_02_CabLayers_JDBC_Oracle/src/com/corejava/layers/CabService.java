package com.corejava.layers;

public class CabService {
	String category;
    
	
	public int addCab(int carId,String name,double price) throws ClassNotFoundException {
		System.out.println("This is CabService");
		System.out.println(carId +" " + name +  " " +price);
		
		if(price<300) {
			category="Basic";
		}
		else if(price>=300 && price<600) {
			category="Standard";
		}
		else if(price>=600 && price<800) {
			category="Premium";
		}
		else {
			category = "Luxury";
		}
		
		CabBean cabBean = new CabBean();
		
		cabBean.setCarId(carId);  
		cabBean.setName(name);    
		cabBean.setPrice(price);    
		cabBean.setCategory(category);    
		
		
		CabDAO cabDAO = new CabDAO();
		int k = cabDAO.addCab(cabBean);
		
		return k;
	}
}
