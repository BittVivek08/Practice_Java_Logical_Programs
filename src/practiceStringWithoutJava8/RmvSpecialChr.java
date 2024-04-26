package practiceStringWithoutJava8;

public class RmvSpecialChr {

	public static void main(String[] args) {

		String str = "!B%(*&i*^%t*@#t!@#u";
		
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);
	}

}
