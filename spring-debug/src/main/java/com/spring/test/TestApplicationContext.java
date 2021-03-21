package com.spring.test;

import com.spring.extend.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/1/22-16:30
 */
public class TestApplicationContext {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("applicationContext.xml");
	}
}
