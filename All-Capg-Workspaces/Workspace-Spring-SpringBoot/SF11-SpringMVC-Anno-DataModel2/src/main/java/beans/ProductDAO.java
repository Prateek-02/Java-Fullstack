package beans;

import java.sql.*;
import org.springframework.stereotype.Repository;

/*
 @Repository
 - Indicates DAO layer
 - Handles database logic
*/
@Repository
public class ProductDAO {

    public Product validateProduct(String pname , double price) {
    System.out.println("DAO PRODUCT-NAME = " + pname);
    System.out.println("DAO PRODUCT-PRICE = " + price);
        Product dbProduct = null;

        try {
            // Load Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create DB connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "scott",
                "tiger"
            );
                   System.out.println("DB CONNECTED");
            PreparedStatement ps = con.prepareStatement(
           "SELECT productId , productName , productPrice FROM products WHERE productName=? AND productPrice=?");
            
            ps.setString(1, pname);
            ps.setDouble(2, price);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	dbProduct = new Product();
            	dbProduct.setProductId(rs.getInt("productId"));
            	dbProduct.setProductName(rs.getString("productName"));
            	dbProduct.setProductPrice(rs.getDouble("productPrice"));
                System.out.println("LOGIN SUCCESS");
            } else {
                System.out.println("NO RECORD FOUND");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dbProduct;
    }
}