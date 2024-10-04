package stream;

import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		Stream<Integer> ss = Stream.of(1, 2, 3, 4, 5);
		System.out.println("=========== Serial Stream ==========");
         ss.forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));
         
         System.out.println("==========Parallel Stream============");
         Stream<Integer> ps = Stream.of(1, 2, 3, 4, 5);
         ps.parallel().forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));
	}

}
