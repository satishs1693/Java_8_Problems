package EqualsandHashCodeContrast;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] empArr = new Employee[7];
		empArr[0] = new Employee("satish", 101, 26, "EEE");
		empArr[1] = new Employee("Ragesh", 102, 24, "ECE");
		empArr[2] = new Employee("satish", 103, 21, "EEE");
		empArr[3] = new Employee("satish", 104, 26, "ECE");
		empArr[4] = new Employee("Aray", 107, 27, "EEE");
		empArr[5] = new Employee("Raja", 106, 28, "CSE");
		empArr[6] = new Employee("satish", 105, 29, "CSE");
		
		Comparator<Employee> AgeComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				
				int i=1;
				System.out.println(o1);
				System.out.println(o2);
				
				System.out.println("*********************");
				
					return o1.getAge()-o2.getAge();
			}
		};
		ArrayList colList = new ArrayList(Arrays.asList(empArr));
		Collections.sort(colList,AgeComparator);
		System.out.println(colList);
		
		Arrays.sort(empArr, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
						int flg = o1.getDept().compareTo(o2.getDept());
						if(flg==0) flg = o1.getName().compareTo(o2.getName());
						return flg;
				//return 0;
			};
		});
		System.out.println(Arrays.toString(empArr));
	}

}
class Employee{
	private String name;
	private int id;
	private int age;
	private String dept;
	public Employee(String name, int id, int age, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", dept=" + dept + "]";
	}
	
}