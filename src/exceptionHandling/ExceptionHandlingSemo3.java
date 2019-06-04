package exceptionHandling;

public class ExceptionHandlingSemo3 {

	public static void main(String[] args) {
		
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("HI");
			e.printStackTrace();
		}
	}
	
	}