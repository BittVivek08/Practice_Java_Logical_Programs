package leetCodeProblems_Array;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] str) {
		if(str == null || str.length == 0) {
			return "";
		}
		
		// Start with the first string as the initial prefix 
		String prefix = str[0];
		
		// Compare the prefix with each string in the array
		for(int i = 1; i < str.length; i++) {
			
			// Update the prefix to the longest common prefix found so far
			while(str[i].indexOf(prefix) != 0) {
				
				// Reduce the prefix by one character from the end
				prefix = prefix.substring(0, prefix.length() - 1);
				
				// If there is no common prefix
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		
		return prefix;
	}

	public static void main(String[] args) {
		
		String[] str = {"flower","flow","flight"};
		String result = longestCommonPrefix(str);
        System.out.println("Input str : = [\"flower\", \"flow\", \"flight\"]" );
        System.out.println("Output : \"" + result + "\"");
	}

}
