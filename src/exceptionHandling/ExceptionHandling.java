package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println("This stmt will not be excecuted");
		}catch(NullPointerException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("This block will always be executed");
		}

	}

}
