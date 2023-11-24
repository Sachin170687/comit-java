package org.comit.course.Collection;

import java.util.HashSet;
import java.util.Set;

public class Personsetexample {

	public static void main(String[] args) {
		
		Set<Person> set=new HashSet<>();
		
		set.add(new Person("John",30));
		set.add(new Person("John",30));
		set.add(new Person("Jane",28));
		set.add(new Person("Mike",36));
		set.add(new Person("Pete",27));
		
		System.out.println(set.size());
		System.out.println(set.contains(new Person("Mike",36)));
		set.remove(new Person("Pete",27));
		
		set.forEach(System.out::println);
		// set.clear();
		set.forEach(System.out::println);
		System.out.println("Enhanced For Loop");
		for (Person p:set) {
			System.out.println(p);
		}
	}

}
