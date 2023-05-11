package ex_g4w2;

import java.time.LocalDate;
import java.util.List;

public class Order {
	int id;
	String status;
	LocalDate orderDate;
	LocalDate deliveryDate;
	List<Product> products;
	Customer customer;
	
	public Order(int id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> productList, Customer customer) {
		 this.id = id;
		 this.status = status;
		 this.orderDate=orderDate;
		 this.deliveryDate=deliveryDate;
		 this.products=productList;
		 this.customer=customer;
		
	}
	
}
