package strings;

public class SwapOfTwoStrings {

	public static void main(String[] args) {
		
		String a = "Roopa";
		String b = "Rani";
		
		System.out.println("Before Swap:" +a+ " " +b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swap :" +a+ " " +b);

	}

}
