package org.comit.course.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapexample {

	public static void main(String[] args) {
		
		//Map<Integer,Person> map=new HashMap<>();
		
		//Map<Integer,Person> map=new LinkedHashMap<>();
		
		Map<Integer,Person> map=new TreeMap<>();
		
		map.put(7, new Person("John",30));
		map.put(3, new Person("Jane",33));
		map.put(11, new Person("Mike",22));
		map.put(4, new Person("Pete",40));
		map.put(13, new Person("Omar",24));
		map.put(9, new Person("Lily",35));
		
		System.out.println(map.size());
		
		map.forEach((k,v)-> System.out.printf("k:%d - v:%s %n",k,v));
		
		map.forEach((k,v)-> System.out.printf("%d - %s %n",k,v));
		
		for (int k:map.keySet()) {
			 System.out.println(k + " - "+ map.get(k));
			 
		System.out.println(map.get(13));
		}
	}

}
