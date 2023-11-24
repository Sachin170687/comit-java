package org.comit.course.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setexample {

	public static void main(String[] args) {
		
		//Set<String> set=new LinkedHashSet<>();
		
		Set<String> set=new HashSet<>();
		
		set.add("John");
		set.add("John");
		set.add("Jane");
		set.add("Mike");
		set.add("Pete");
		set.add("Mike");
		
		System.out.println(set.size());
		set.forEach(System.out::println);
		System.out.println(set.contains("Jane"));
		System.out.println(set.remove("Jane"));
		System.out.println(set.contains("Jane"));
		//set.clear();
		set.forEach(System.out::println);
		System.out.println("Enhanced For Loop");
		for (String str : set) {
			System.out.println(str);
		}
	}

}
