package basic;

public class MainInnerTest {

	public static void main(String[] args) {

		
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerClass myInner = outer.new InnerClass();
		
		System.out.println(outer.x + myInner.y);

	}

}
