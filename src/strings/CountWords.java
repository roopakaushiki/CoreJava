package strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words=	s.trim().split("");
		System.out.println("Number of Words In a String are :" +words.length);

	}

}
