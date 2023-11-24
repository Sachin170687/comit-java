package org.comit.course.Access_Modifiers_Protected;

import org.comit.course.Access_Modifiers_Protected_same_package.MyClass;

public class Otherpackage extends MyClass{
	
	void dosomething2() {
		this.num=5;
		this.dosomething();
	}

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		//obj.num=5;
		//obj.dosomething();

	}

}
