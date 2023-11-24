package org.comit.course.Collection;


import java.util.Objects;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	
	public int compareTo(Person p) {
		
		//return this.name.compareTo(p.name);
		return Integer.valueOf(this.age).compareTo (p.age);
	}	

	
	
	
}
