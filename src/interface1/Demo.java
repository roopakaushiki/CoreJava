package interface1;

interface MyInterface
{
	public void method1();
	public void method2();
}

public class Demo implements MyInterface{

	
	public void method1() {
		System.out.println("method1");
	}
	
	public void method2() {
		System.out.println("method2");
	}
	public static void main(String[] args) {
		
		
		MyInterface f = new Demo();
		f.method1();
		f.method2();

	}

}
