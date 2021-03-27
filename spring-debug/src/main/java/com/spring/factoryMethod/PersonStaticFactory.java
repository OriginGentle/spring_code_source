package com.spring.factoryMethod;

public class PersonStaticFactory {

	public static Person getPerson(String name) {
		Person person = new Person();
		person.setId(1);
		person.setName(name);
		return person;
	}

	public static Person getPerson(int age) {
		return new Person();
	}

	public Person getPerson(String name, int id) {
		Person person = new Person();
		person.setId(1);
		person.setName(name);
		return person;
	}
}