package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 @Controller
 - Marks this class as a Controller
 - Handled by Spring MVC DispatcherServlet
*/
@Controller
public class ProductController {

    /*
     @Autowired
     - Injects LoginService automatically
     - Dependency Injection (DI)
    */
    @Autowired
    private ProductService productService;

    /*
     @RequestMapping("/login.spring")
     - Maps URL to this method
     - Called when form is submitted
    */
    @RequestMapping("/product.spring")
    public ModelAndView productValid(@RequestParam String pname,@RequestParam double price) {

        ModelAndView mav = new ModelAndView();
        Product dbProduct = productService.checkProduct(pname , price);

        if (dbProduct != null) {
        	mav.addObject("productId" , dbProduct.getProductId());
            mav.addObject("productName", dbProduct.getProductName());
            mav.addObject("productPrice", dbProduct.getProductPrice());
            mav.setViewName("/Success.jsp");
        } else {
            mav.setViewName("/Failed.jsp");
        }
        return mav;
    }
}