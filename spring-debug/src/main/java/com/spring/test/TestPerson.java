package com.spring.test;

import com.spring.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/3/28-20:54
 */
public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
		Person p1 = context.getBean(Person.class);
		Person p2 = context.getBean(Person.class);
	}

}
