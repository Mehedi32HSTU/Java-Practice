package OOP_with_java;

class BaseClass
{
	public int roll;
	public String name;
	public BaseClass() {
		
	}
	public BaseClass(int roll, String name) {
		this.roll = roll;
		this.name = name;
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

public class ArraysOfObject {
	public static void main(String args[]) {
		BaseClass obj[]=new BaseClass[5];	// Declare 5 array object of BaseClass;
		for(int i=0;i<5;i++)
		{
			obj[i]=new BaseClass(); 	// initiate every object with new BaseClass otherwise it will give NullPointerException.
			
			obj[i].setRoll(1);
			String nm=Integer.toString(i);
			nm+=" Mehedi ";
			nm+=Integer.toString(i);
			obj[i].setName(nm);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll : "+obj[i].getRoll()+" and Name : "+obj[i].getName());
		}
	}
}
