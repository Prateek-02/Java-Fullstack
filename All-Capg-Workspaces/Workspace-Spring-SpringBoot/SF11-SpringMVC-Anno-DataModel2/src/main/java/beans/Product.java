package beans;

/*
 POJO class used for:
 Data Binding
 Transferring data between layers
*/
public class Product {

	// Must match input field names
	private int productId;
	private String productName;
	private double productPrice;
	
	// Getter & Setter required for Spring binding
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	
	
}