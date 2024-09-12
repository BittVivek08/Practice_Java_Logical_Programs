package leetCodeProblems_String;

public class IndexOfFirstOccurence {
	
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty()) {
			return 0;
		}
		int haystackLength = haystack.length();
		int needleLength = needle.length();
		
		if(needleLength > haystackLength) {
			return -1;
		}
		for(int i = 0; i<= haystackLength - needleLength; i++){
			String subString = haystack.substring(i, i + needleLength);
			if(subString.equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String haystack1 = "sadbutsad";
		String needle1 = "sad";
		System.out.println("Input : haystack1 = " + haystack1 + ", needle = " + needle1);
		System.out.println("Output :: " + strStr(haystack1, needle1));

	}

}
