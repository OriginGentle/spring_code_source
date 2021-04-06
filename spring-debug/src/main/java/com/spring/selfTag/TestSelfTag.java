package com.spring.selfTag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/4/6-16:45
 */
public class TestSelfTag {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("selfTag.xml");
		User user = context.getBean(User.class);
		System.out.println(user.getEmail());
	}
}
