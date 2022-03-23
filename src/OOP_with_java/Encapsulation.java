package OOP_with_java;

// Encapsulation -> Binding Data with methods so that Data can be restricted from direct access.

class Student
{
	private int roll;
	private String name;
	
	public Student(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}


public class Encapsulation {

	public static void main(String[] args) {
		
		Student obj= new Student(1,"Mehedi");
		
		System.out.println(obj.getRoll());
		System.out.println(obj.getName());
		
		obj.setRoll(89);
		obj.setName("Hasan");
		
		System.out.println(obj.getRoll());
		System.out.println(obj.getName());

	}
}
