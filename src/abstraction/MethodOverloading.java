package abstraction;

class Overload{
	void demo(int a) {
		System.out.println(a);
	}
	
	void demo(int b,int d) {
		System.out.println(b+":"+d);
	}
	double demo(double c) {
		System.out.println(c);
		return c*c;
	}

}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Overload o = new Overload();
		double result;
		o.demo(6);
		o.demo(78.0);
		o.demo(5, 3);
	result=	o.demo(5.5);
	System.out.println(result);
	
	}

}
