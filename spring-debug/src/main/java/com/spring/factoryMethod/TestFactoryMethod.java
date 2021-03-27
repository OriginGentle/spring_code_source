package com.spring.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryMethod {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("factoryMethod.xml");
		Person person1 = ac.getBean("person1", Person.class);
		System.out.println(person1);
		Person person2 = ac.getBean("person2", Person.class);
		System.out.println(person2);
	}
}
