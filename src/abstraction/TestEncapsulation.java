package abstraction;

 class Encapsulate1{
	 
	private String name;
	private int age;
	private int rollNum;
	
	public int getage() {
		return  age;
	}
	public String getname() {
		return name;
	}
	
	public int getrollNum() {
		return rollNum;
	}
	
	public void setAge(int newage) {
		age = newage;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setrollNum(int newRollNum) {
		rollNum=newRollNum;
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
		
		Encapsulate1 e = new Encapsulate1();
		e.setAge(26);
		e.setName("Rani");
		e.setrollNum(675);
		System.out.println("Age is:" +e.getage());
		System.out.println("Name is:" +e.getname());
		System.out.println("RollNum is :" +e.getrollNum());

	}

}
