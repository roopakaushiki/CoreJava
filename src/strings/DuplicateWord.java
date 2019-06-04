package strings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWord {

	static void duplicateWords(String inputstring) {
		String[] words = inputstring.split("");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word : words) {
			if(wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
			}else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
			Set<String> wordInString = wordCount.keySet();
			for(String word1 : wordInString) {
				if(wordCount.get(word1)>1) {
					System.out.println(word1+ " : "+wordCount.get(word1));
				}
				
			}
			
		}
	
	
	public static void main(String[] args) {
		duplicateWords("Butter Better and Bread");
		duplicateWords("Java is Java again java");
		duplicateWords("Sper Man Bat Man");
		
		
		

	}

}
