package comparator_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Samsung A5", 17000));
		list.add(new Product(3, "Iphone 6S", 65000));
		list.add(new Product(2, "Sony Xperia", 25000));
		list.add(new Product(4, "Nokia Lumia", 15000));
		list.add(new Product(5, "Redmi4 ", 26000));
		list.add(new Product(6, "Lenevo Vibe", 19000));

		System.out.println("Sorted By Name....");
		System.out.println();

		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (Product p : list) {
			System.out.println(p.id + "," + p.name + "," + p.price);
		}
		System.out.println("=======================");

		System.out.println("Filtered List....");
		System.out.println();

		Stream<Product> filteredProduct = list.stream().filter(p -> p.price > 20000);

		filteredProduct.forEach(product -> System.out.println(product.id + "," + product.name + ":" + product.price));

	}

}
