package strings;

public class Encapsulate
{
	private String geekName;
	private int geekRoll;
	private int geekAge;

//get method for age to access

public int getAge() {
	return geekAge;
}

//get method for roll to access

public int geekRoll() {
	return geekRoll;
}

//get method for name to access

public String geekName() {
	return geekName;
}

//set method foe age to access
public void setAge(int newAge) {
	geekAge = newAge;
}

//set method foe roll to access
public void setRoll(int newRoll) {
	geekRoll = newRoll;
}

//set method for name to access
public void setName(String newName) {
	geekName = newName;
}


 public static void main(String[] args) {
		
	 Encapsulate e = new Encapsulate();
	 
	 //setting values
	 e.setName("Roopa");
	 e.setAge(23);
	 e.setRoll(213);
	 
	 //Displaying values for variables
	 System.out.println("Geek Name is: "  +e.geekName());
	 System.out.println("Geek Roll is: "  +e.geekRoll());
	 System.out.println("Geek Age is: "  +e.getAge());

	}

}
