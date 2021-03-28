package com.spring.selfEditor;

import com.spring.extend.MyClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/3/12-21:50
 */
public class TestSelfEditor {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("selfEditor.xml");
		Customer customer = ac.getBean(Customer.class);
		System.out.println(customer);
	}

}
