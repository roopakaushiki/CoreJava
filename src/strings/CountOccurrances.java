package strings;

public class CountOccurrances {

	public static void main(String[] args) {
		
		String s = "Java is Java agian Java again";
		char c ='a';
			int count =	s.length()-s.replace("i", "").length();
			System.out.println("Number of occurrances of 'a' in "+s+"  = "+count);
		
		

	}

}
