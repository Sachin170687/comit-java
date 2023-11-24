package org.comit.course.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		//ArrayList<String> list1=new ArrayList<String>();
		//ArrayList<String> list2=new ArrayList<>();
		
		
		//List<String> list=new LinkedList<>();
		
		List<String> list=new ArrayList<>();
		
		list.add("John");
		list.add("John");
		list.add("Jane");
		list.add("Mike");
		list.add("Pete");
		list.add("Mike");
		
		list.add(3,"Nick");
		
		list.set(3,"Lily");
		
		list.remove("Mike");
		
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Enhanced For Loop");
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("For Each Method with lamda expression");
		list.forEach(str->System.out.println(str));
		System.out.println("For Each Method with method refrencing");
		list.forEach(System.out::println);
		System.out.println(list.indexOf("John"));
		System.out.println(list.contains("Jane"));
		System.out.println(list.contains("Lily"));
		System.out.println(list.contains("Jane1"));
		
		
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(6);
		nums.add(1);
		nums.add(7);
		
		System.out.println(nums);
		
		List<Integer> nums2 =List.of(4,6,1,7);
		System.out.println(nums2);
		
		List<Integer> nums3 =Arrays.asList(4,6,1,7);
		System.out.println(nums3);
		
		System.out.println("Converting arrays into array list");
		
		Integer [] array= {1,2,3,4};
		
		List<Integer> nums4=Arrays.asList(array);
		System.out.println(nums4);
	}
}
