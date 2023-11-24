package org.comit.course.Collection;

import java.util.ArrayList;
import java.util.List;
import org.comit.course.Collection.Person;

public class Personlistexample {

	public static void main(String[] args) {
		
		
		
		List<Person> list=new ArrayList<>(10);
		
		Person p1=new Person("John",30);
		list.add(p1);
		Person p2=new Person("John",30);
		list.add(p2);
		p1=new Person("Jane",28);
		list.add(p1);
		list.add(new Person("Mike",36));
		list.add(new Person("Pete",27));
		
		System.out.println(list.size());
		System.out.println("USING TOSTRING METHOD");
		System.out.println(list);
		System.out.println("USING FOREACH METHOD");
		list.forEach(System.out::println);
		System.out.println("DISPLAYING PARTICULAR VALUE");
		System.out.println(list.get(2));
		list.add(2, new Person("Nick",21));
		System.out.println("USING FOREACH METHOD");
		list.forEach(System.out::println);
		list.set(2, new Person("Lily",31));
		System.out.println("USING FOREACH METHOD");
		list.forEach(System.out::println);
		list.remove(2);
		System.out.println("USING FOREACH METHOD to show remove method");
		list.forEach(System.out::println);
		System.out.println("USING FOREACH METHOD to show added lily");
		list.set(2, new Person("Lily",31));
		list.forEach(System.out::println);
		System.out.println("USING FOREACH METHOD to show removal of lily after generating equals method");
		list.remove(new Person("Lily",31));
		list.forEach(System.out::println);
		System.out.println(list.indexOf(new Person("Mike",36)));
		System.out.println(list.contains(new Person("Mike",36)));
		System.out.println("Display result using for each method");
		for(Person p:list) {
			System.out.println(p);
		}
		System.out.println("Display result using traditional for loop");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}

}
