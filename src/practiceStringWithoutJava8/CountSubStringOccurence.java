package practiceStringWithoutJava8;

public class CountSubStringOccurence {
	
	
	    public static void main(String[] args) {
	        String s = "bittukumarbittusinghbittupatel";
	        String substring = "bittu";
	        int count = countSubstringOccurrences(s, substring);
	        System.out.println("The substring \"" + substring + "\" appears " + count + " times in the given string.");
	    }

	    public static int countSubstringOccurrences(String str, String substr) {
	        int count = 0;
	        int index = 0;

	        // Iterate through the string
	        while ((index = str.indexOf(substr, index)) != -1) {
	            index += substr.length();
	            count++;
	        }

	        return count;
	    }
}
