package misllaneous;

public class CountOccurenceOfWord {
	
	
	    public static void main(String[] args) {
	        String text = "hellobittuhowareyoubittu";
	        String target = "bittu";
	        int count = countOccurrences(text, target);
	        System.out.println("The substring \"" + target + "\" appears " + count + " times.");
	    }

	    public static int countOccurrences(String text, String target) {
	        int count = 0;
	        int lastIndex = 0;

	        while (lastIndex != -1) {
	            lastIndex = text.indexOf(target, lastIndex);
	            if (lastIndex != -1) {
	                count++;
	                lastIndex += target.length();
	            }
	        }

	        return count;
	    }
	


}
