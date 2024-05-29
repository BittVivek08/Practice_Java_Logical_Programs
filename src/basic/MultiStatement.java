package basic;

public class MultiStatement {

	public static void main(String[] args) {
		
		Sayable person = (message) -> {
			String s1 = "I would like to say, ";
			String s2 = s1 + message;
			return s2;
		};
		
		System.out.println(person.say("Time is Precious."));

	}

}
