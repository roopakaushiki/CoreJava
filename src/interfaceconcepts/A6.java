package interfaceconcepts;

interface printable{
	void print();
}

public class A6 implements printable {
	
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		A6 a = new A6();
		a.print();

	}

}
