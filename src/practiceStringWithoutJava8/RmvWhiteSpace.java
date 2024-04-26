package practiceStringWithoutJava8;

public class RmvWhiteSpace {

	public static void main(String[] args) {

		String str = "  V  i v   e     k  ";
		
		String replaceAll = str.replaceAll("\\s", "");
		System.out.println(replaceAll);
	}

}
