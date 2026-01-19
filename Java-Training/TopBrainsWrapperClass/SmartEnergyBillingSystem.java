package TopBrainsWrapperClass;

public class SmartEnergyBillingSystem {
	public static void main(String[] args) {
		MeterReading m1 = new MeterReading(1200,1350);
		MeterReading m2 = new MeterReading(null,1200);
		MeterReading m3 = new MeterReading(900,null);
		
		Customer customer[] = {
				new Customer(101,"Ramesh",m1),
				new Customer(102,"Sita",m2),
				new Customer(103,"Mohan",m3),
		};
		
		BillingService bs = new BillingService();
		
		for(Customer c : customer) {
			bs.generateBill(c);
		}
	}
}

class MeterReading{
	private Integer prevReading;
	private Integer currReading;
	
	
	MeterReading(Integer prevReading,Integer currReading){
		this.prevReading = prevReading;
		this.currReading = currReading;
	}
	
	public Integer getPrevReading() {
		return prevReading;
	}
	
	public Integer getCurrReading() {
		return currReading;
	}

}

class Customer{
	private Integer customerId;
	private String customerName;
	private MeterReading reading;
	
	Customer(Integer customerId,String customerName,MeterReading reading){
		this.customerId = customerId;
		this.customerName = customerName;
		this.reading = reading;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public MeterReading getReading() {
	    return reading;
	}
	
}


class BillingService{
	public Integer calculateUnits(MeterReading m) {
		if(m.getCurrReading() == null ||  m.getPrevReading() == null) {
			return null;
		}
		return m.getCurrReading() - m.getPrevReading();
	}
	
	public Integer calculateBill(MeterReading m) {
		Integer consumedUnits = calculateUnits(m);
		if(consumedUnits == null) {
			return null;
		}
		return consumedUnits *5;
	}
	
	public void generateBill(Customer c) {
		String name = c.getCustomerName();
		MeterReading m = c.getReading();
		Integer units = calculateUnits(m);
		
		if(units == null) {
			System.out.println(name +" --> Invalid Meter Data");
			return;
		}
		
		Integer bill = calculateBill(m);
		System.out.println(name + " --> Units: "+units + " --> Bill: "+bill);
		
	}
}


