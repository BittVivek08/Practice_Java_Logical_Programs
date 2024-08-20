package practiceForInterview_23_07_24;

import java.util.TreeSet;

public class JavaTreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Object> t = new TreeSet<>(new MyComparator());
		
		t.add("A");
		t.add(new StringBuffer("AA"));
		t.add(new StringBuffer("ABC"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		
		System.out.println(t);

	}

}
