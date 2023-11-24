package org.comit.course.Super;

class Manager {	
	double salary=5000;
	double bonus;
	
	Manager(){
		System.out.println("Parent Class Constructor");
	}
	
	void calBonus() {
	this.bonus=this.salary+2000;
	}
}

class Resource extends Manager{
	
	double salary=3000;
	double bonus;
	
	Resource(){
		super();
		System.out.println("Child Class Constructor");
	}
	
	void display() {
		
		System.out.println("Resource's Salary ="+salary);
		System.out.println("Manager's Salary ="+super.salary);
	}
	
	void calBonus() {
	this.bonus=this.salary+500;
	super.bonus=super.salary+2000;
	}

	void displayBonus() {
		
		System.out.println("Resource's Bonus="+bonus);
		System.out.println("Manager's Bonus="+super.bonus);
	}
	
}



public class Superkeyword {

	public static void main(String[] args) {
		
		Resource res=new Resource();
		
		res.display();
		res.calBonus();
		res.displayBonus();;

	}

}
