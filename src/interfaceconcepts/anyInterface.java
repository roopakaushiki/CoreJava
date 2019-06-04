package interfaceconcepts;

public interface anyInterface {
	
	int i =0;
	void abstracrMethod();
	default void defaultMethod() {
		System.out.println("Interface can have default methods");
	}
	static void staticMethod() {
		System.out.println("Interface have static methods");
	}
	
	abstract class anyAbstractClass{
		private int a;
		protected int b;
		public int c;
		static int d;
		final int e = 10;
		int f;
		public anyAbstractClass() {
			System.out.println("constructor");
		}
		private static void  staticmethod() {
			
		}
		protected void protectedMethod() {
			
		}
	}

}
