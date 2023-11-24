package org.comit.course.Abstraction;


class Organisation{
	
	int departmentid=1;	
	}
	
interface otherIncome{
	
	void display2();
}

interface Income {
	
	double calculatePay(double salary,double taxes);
	void display();
}


class Employee extends Organisation implements Income,otherIncome{

	
	@Override
	public void display() {
		System.out.println("Net Salary");	
		
	}
	
	
	

	@Override
	public String toString() {
		return String.format("Employee [departmentid=%s]", departmentid);
	}




	@Override
	public double calculatePay(double salary, double taxes) {
		return salary-taxes;
	}




	@Override
	public void display2() {
		int extraincome=2000;
		System.out.println(extraincome);
		
	}

	
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		
		double result=obj1.calculatePay(3000, 1200);
		
		obj1.display();
		obj1.display2();
		System.out.println(result);
		System.out.println(obj1);
	}

}
