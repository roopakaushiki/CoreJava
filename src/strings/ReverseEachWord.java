package strings;

public class ReverseEachWord {

	static void reverseOfEachstring(String inputString) {
		
		String[] words = inputString.split("");
		String reverseString= "";
		
		for(int i=0;i<words.length;i++) {
			String word= words[i];
			String reverseword="";
		
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword+word.charAt(j);
			}
			reverseString=reverseString+reverseword+"";
		}
			System.out.println(inputString);
			System.out.println(reverseString);
			System.out.println("-------------------");
		}
		
		
		
		public static void main(String[] args) {
		
			reverseOfEachstring("Java Concept of the day");
			reverseOfEachstring("Chinna is so beautiful");
			reverseOfEachstring("Roopa is so beautiful");

	}

}
