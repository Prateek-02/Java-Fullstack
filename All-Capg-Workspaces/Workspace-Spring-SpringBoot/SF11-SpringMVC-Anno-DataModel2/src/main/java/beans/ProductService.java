package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 @Service
 - Indicates Business Logic Layer
*/
@Service
public class ProductService {

    /*
     @Autowired
     - Injects DAO layer
    */
    @Autowired
    private ProductDAO productDAO;

    // Business method
    public Product checkProduct(String pname , double price) {
        return productDAO.validateProduct(pname, price);
    }
}