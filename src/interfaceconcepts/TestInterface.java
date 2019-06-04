package interfaceconcepts;

interface Drawable{
	void draw();
}


class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}


class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing circle");
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		Drawable d = new Circle();
		d.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		

	}

}
