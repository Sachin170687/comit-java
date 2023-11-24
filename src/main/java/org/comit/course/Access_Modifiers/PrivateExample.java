package org.comit.course.Access_Modifiers;


class Employee{
	
	private int salary=5000;
	private int bonus;
	
	void salary() {
		System.out.println(salary);
		bonus();
	}
	
	private void bonus() {
		bonus=2000;
		System.out.println(bonus);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/*private Employee() {
		
	}*/
	

	
}	



class EmployeePersonalDetails extends Employee {
	
	void display() {
		System.out.println(getSalary());
	}
}


public class PrivateExample {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		/*
		emp1.salary=4000;
		System.out.println(emp1.salary);
		*/
		
		emp1.salary();
		
		
		EmployeePersonalDetails emd1=new EmployeePersonalDetails();
		emd1.display();
		
		
		
		
	}

}
