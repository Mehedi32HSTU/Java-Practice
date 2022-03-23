package OOP_with_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
	Integer id;
	Long salary;
	String name;
	Integer priority;

	public Employee() {

	}

	public Employee(Integer id, Long salary, String name, Integer priority) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.priority = priority;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Salary=" + salary + ", name=" + name + ", priority=" + priority + "]";
	}

	@Override
	public int compareTo(Employee o) {

		Employee emp= (Employee) o;

		if(this.salary.equals(emp.getSalary())){
			
			if(this.priority.equals(emp.getPriority())){
				
				if(this.name.length()==emp.getName().length()){
					
					if(this.id>emp.getId()) return 1;
					else if(this.id < emp.getId()) return -1;
					else return 0;
					
				} else if(this.name.length()>emp.getName().length()) return 1;
				else if(this.name.length()<emp.getName().length()) return -1;
				
			} else if(this.priority>emp.getPriority()) return 1;
			else if(this.priority<emp.getPriority()) return -1;
			
		} else if(this.salary<emp.getSalary()) return 1;
		else if(this.salary>emp.getSalary()) return -1;

		return 0;

		//		if(salary<emp.salary)
		//			return 1;
		//		else if(salary>emp.salary)
		//			return -1;
		//		
		//		if(priority>emp.priority)
		//			return 1;
		//		else if(priority<emp.priority)
		//			return -1;
		//		
		//		if(id>emp.id)
		//			return 1;
		//		else if(id<emp.id)
		//			return -1;
		//		
		//		if(name.length()>emp.name.length())
		//			return 1;
		//		else if(name.length()<emp.id)
		//			return -1;

		//		return 0;
	}
}


public class ObjectSortComparable {

	public static void main(String[] args) {
		List<Employee> obj=new ArrayList<>();	// Declare 5 array object of BaseClass;
		//		for(int i=0;i<6;i++)
		//		{
		//			obj[i]=new Employee(); 	    // initiate every object with new BaseClass otherwise it will give NullPointerException.			
		//		}
		obj.add(new Employee(1,32000L,"Mehedi1",1));
		obj.add(new Employee(2,35000L,"Hasan",4));
		obj.add(new Employee(3,33000L,"Sifat",2));
		obj.add(new Employee(3,33000L,"Angsh",2));
		obj.add(new Employee(4,33000L,"Mehedi",1));
		obj.add(new Employee(5,32000L,"Bappy",3));
		obj.add(new Employee(6,34000L,"Rafsan",3));
		obj.add(new Employee(7,34000L,"Sohel",3));
		obj.add(new Employee(8,32000L,"Bapp1",3));

		Collections.sort(obj);
		for(Employee emp : obj)
			System.out.println(emp);
	}

}
