
class Human{
	public  void walk() {
		System.out.println("Human walks");
	}
}

class Boy extends Human{
	public  void walk() {
		System.out.println("Boy walks");
	}


//public class StaticPoly {

	public static void main(String[] args) {
		
		Human h = new Boy();
		h.walk();
		Human h1= new Human();
		h1.walk();

	}

}
