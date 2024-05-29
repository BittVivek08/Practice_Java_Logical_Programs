package comparator_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSort {

	public static void main(String[] args) {
		
		List<Product> product = new ArrayList<>();
		
		product.add(new Product(11, "Zebronics Mouse", 699.75));
		product.add(new Product(12, "Asus Laptop", 50000.25));
		product.add(new Product(13, "Redmi Mobile", 25458.375));
		product.add(new Product(14, "Realme Smart Watch", 1879.45));
		
	    System.out.println("Sorting On the basis of name of the product.....");
	    System.out.println();
	    
	    Collections.sort(product,(p1,p2)-> {
	    	return p1.name.compareTo(p2.name);
	    });
	    
	    for(Product p : product) {
	    	
		    System.out.println(p.id + " " + p.name + " " +p.price);

	    }
	    

	}

}
