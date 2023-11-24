package org.comit.course.Collection;

import java.util.Set;
import java.util.TreeSet;

public class Persontreesetexample {

	public static void main(String[] args) {
		
		Set<Person> set=new TreeSet<>();
		
		set.add(new Person("John",30));
		set.add(new Person("John",30));
		set.add(new Person("Jane",28));
		set.add(new Person("Mike",36));
		set.add(new Person("Pete",27));
		
		//System.out.println("Compare on the basis of name in Person Class ");
		//set.forEach(System.out::println);
		
		System.out.println("Compare on the basis of age in Person Class ");
		set.forEach(System.out::println);


	}

}
