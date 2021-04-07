package com.spring.test;

import com.spring.extend.MyClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/1/22-16:30/
 */
public class TestApplicationContext {
	public static void main(String[] args) {
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("applicationContext.xml");
	}
}
