package strings;


public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Emp e = new Emp();
		e.setEmpId(3);
		e.setEmpName("Navee");
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		
		//EncapsulationDemo e2 = new EncapsulationDemo();
		
	}

}
class Emp{
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}