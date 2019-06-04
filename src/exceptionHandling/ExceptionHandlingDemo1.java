package exceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		
		String[] s = {"abc","123","xyz","456"};
		for(int i=0;i<s.length;i++) {
			try {
				int value = Integer.parseInt(s[i]);
			}catch(NumberFormatException ex) {
				System.out.println("NumberFormatException caught here");
			}finally {
				System.out.println("always");
			}
		}

	}

}
