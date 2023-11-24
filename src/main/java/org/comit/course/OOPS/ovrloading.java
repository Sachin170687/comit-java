package org.comit.course.OOPS;

// method can override another method from super class

class Employ{
	
	String name;
	double salary;
	double bonus;
	
	void CalBonus(int perc) {
		this.bonus=this.salary+perc;		
}

@Override
	public String toString() {
		return String.format("Employ [salary=%s, bonus=%s]", salary, bonus);
	}

public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Accntant extends Employ{	
	@Override
	void CalBonus(int perc) {
		this.bonus=this.salary*perc;
	}
}

class Manager extends Employ{	
	@Override
	
	void CalBonus(int perc) {
		this.bonus=this.salary*perc+1000;
	}
}




public class ovrloading {

	public static void main(String[] args) {
		
		
		Employ em1=new Employ();
		em1.setSalary(2000);
		em1.CalBonus(50);
		System.out.println(em1);
		
        Accntant ac1=new Accntant();
		ac1.setSalary(2000);
		ac1.CalBonus(50);
		System.out.println(ac1);
		
		Manager mg1=new Manager();
		mg1.setSalary(2000);
		mg1.CalBonus(50);
		System.out.println(mg1);
		
	}	
		
		
	}


