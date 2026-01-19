package TopBrainsCollections;

public class OnlineShoppingCart {
	public static void main(String[] args){
        Cart[] carts = {
            new Cart("C1",4,2500.0),
            new Cart("C2",2,1800.0),
            new Cart("C3",null,3000.0)
        };

        DiscountService ds = new DiscountService();
        for (Cart c : carts) {
            System.out.print("Cart " + c.getCartId() + " --> ");

            if (!ds.validateCartData(c)) {
                System.out.println("Invalid Cart Data");
            } 
            else if (ds.isDiscountApplicable(c)) {
                System.out.println("Discount Applied --> Final Amount: " +(c.getTotalAmount() -  ds.calculateDiscount(c)));
            } 
            else {
                System.out.println("No Discount");
            }
        }
    }
}

class Cart{
    private String cartId;
    private Integer itemCnt;
    private Double totalAmount;

    Cart(String cartId,Integer itemCnt,Double totalAmount){
        this.cartId = cartId;
        this.itemCnt = itemCnt;
        this.totalAmount = totalAmount;
    }

    public String getCartId(){
        return cartId;
    }

    public Integer getItemCount(){
        return itemCnt;
    }

    public Double getTotalAmount(){
        return totalAmount;
    }
}

class DiscountService{
    public boolean validateCartData(Cart c) {
        return (c.getItemCount() != null) && (c.getTotalAmount() != null);
    }

    public boolean isDiscountApplicable(Cart c) {
        return c.getItemCount() >= 3 && c.getTotalAmount() >= 2000;
    }

    public double calculateDiscount(Cart c) {
        return c.getTotalAmount() * 0.10;
    }
}
