package ex_g4w2;
import java.util.List;
import java.security.interfaces.XECPublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		Product g = new Product(1,"Ducati","Books",50.0);
		Product h = new Product(2,"Bugatti","Books",100.50);
		Product i = new Product(3,"Ferrari","Boys",0.01);
		Product l = new Product(4,"Maserati","Boys",51.9);
		Product m = new Product(5,"Honda","Baby",1.01);
		Product n = new Product(6,"Mercedes","Boys",1.01);
		
		List<Product> productList1 = new ArrayList<>();
		Product gL = new Product(1,"Ducati","Books",50.0);
		Product hL = new Product(2,"Bugatti","Books",100.50);
		Product iL = new Product(3,"Ferrari","Boys",0.01);
		Product lL = new Product(4,"Maserati","Boys",51.9);
		Product nL = new Product(6,"Mercedes","Boys",1.01);
		
		productList.add(gL);
		productList.add(hL);
		productList.add(iL);
		productList.add(lL);
		productList.add(nL);
		
		
		Customer giacomo = new Customer(4,"Giacomo",1);
		Customer alfredo = new Customer(5,"Alfredo",2);
		
		productList.add(g);
		productList.add(h);
		productList.add(i);
		productList.add(l);
		productList.add(m);
		productList.add(n);
		
		List<Order> orderList = new ArrayList<>();
		
		
		LocalDate mm  = LocalDate.of(2019,02,19);
		LocalDate ss  = LocalDate.of(2019,02,21);
		
		
		Order g1 = new Order(1, "On",mm , ss, productList, giacomo);
		Order g2 = new Order(2, "On",mm , ss, productList1, alfredo);
		
		orderList.add(g2);
		orderList.add(g1);
		

		productList.stream().filter(c -> c.category.equals("Baby")).forEach(s -> System.out.println(s));;
		

		
		
		
	}
	
	

}
