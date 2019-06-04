package strings;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String");
		String inputString = sc.nextLine();
		String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
		System.out.println(inputString);
		System.out.println(stringWithoutSpaces);
		sc.close();

	}

}
