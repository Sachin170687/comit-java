package org.comit.course.Abstraction;




interface officialdetails{
	
	void offdetails();
}

interface personaldetails{
	void perdetails();
}

class Employeedetails implements officialdetails,personaldetails{

	@Override
	public void perdetails() {
		System.out.println("Personal Details");
		
	}

	@Override
	public void offdetails() {
		System.out.println("Official Details");
		
	}
	
	
	
}

public class Interfaceabstraction {

	public static void main(String[] args) {
		
		
		Employeedetails emp1=new Employeedetails();
		emp1.perdetails();
		emp1.offdetails();
		
		officialdetails emp2=new Employeedetails();
		
		emp2.offdetails();
		((Employeedetails)emp2).perdetails();
	}

}
