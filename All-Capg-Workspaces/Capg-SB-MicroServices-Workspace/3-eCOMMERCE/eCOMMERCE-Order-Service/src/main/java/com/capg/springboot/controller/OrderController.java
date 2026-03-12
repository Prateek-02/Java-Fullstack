package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.model.Product;
/**
 * Order Controller
 * Handles order placement
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	private final InventoryClient inventoryClient;
	private final ProductClient productClient;
	
	public OrderController(InventoryClient inventoryClient ,ProductClient productClient ) {
		this.inventoryClient = inventoryClient;
		this.productClient =productClient;
	}

    @GetMapping("/place/{productId}")
    public String placeOrder(@PathVariable Long productId) {
      Product product = productClient.getProduct(productId);
      boolean inStock = inventoryClient.isStockAvailable(productId);
      
      if(inStock) {
    	  return "Order Placed: "+product.getName() + " " + product.getPrice() + " " +product.getId(); 
      }
      else {
    	  return "Product Out of Stock";
      }
      
    }
   
}