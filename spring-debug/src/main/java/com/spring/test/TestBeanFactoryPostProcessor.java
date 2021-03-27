package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/3/27-21:19
 */
public class TestBeanFactoryPostProcessor {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryPostProcessor.xml");
	}
}
