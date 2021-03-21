package com.spring.test;

import com.spring.extend.MyClassPathXmlApplicationContext;
import com.spring.selfEditor.Customer;

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
