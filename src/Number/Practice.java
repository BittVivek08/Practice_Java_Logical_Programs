package Number;

import java.util.function.BiConsumer;

public class Practice {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("Sum : " + (a + b));
		biConsumer.accept(56, 78);
	}

}
