package org.comit.course.Abstraction;


abstract class Organization{
	
	void orgdetails() {
		System.out.println("Organisational Details");
	}
	
	abstract void deptdetails(); 
}

class Department extends Organization{

	@Override
	void deptdetails() {
		System.out.println("Departmental Details");	
	}
	void employmentdetails() {
		System.out.println("Employment Details");
	}
	
	
	
}


public class Abstractclass {

	public static void main(String[] args) {
		
		Department dept1= new Department();
		dept1.deptdetails();
		dept1.employmentdetails();
		dept1.orgdetails();
		
		Organization dept2= new Department();
		
		     dept2.deptdetails();
		     dept2.orgdetails();
((Department)dept2).employmentdetails();
		
		
		
		
	}

}
