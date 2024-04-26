package misllaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {

	public static void main(String[] args) {
		
		List<Product> product = new ArrayList<>();
		
		product.add(new Product(1, "Laptop", 35000f));
		product.add(new Product(2, "Mobile", 15000f));
		product.add(new Product(3, "Watch",  5000f));
		product.add(new Product(4, "Mouse",  500f));
		product.add(new Product(5, "KeyBoard", 2500f));
		product.add(new Product(6, "Fan", 2700f));
		
		List<String> productList = product.stream()
				.filter(n -> n.price > 3000.51)
				.map(n -> n.name)
                .collect(Collectors.toList());
                
		System.out.println(productList);
		
	}

}
