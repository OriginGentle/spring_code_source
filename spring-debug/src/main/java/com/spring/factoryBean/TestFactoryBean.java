package com.spring.factoryBean;

import com.spring.supplier.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/3/27-21:14
 */
public class TestFactoryBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");

		MyFactoryBean bean =(MyFactoryBean) context.getBean("&myFactoryBean");
		System.out.println(bean);

		User user = (User)context.getBean("myFactoryBean");
		System.out.println(user);

		User user1 = (User) context.getBean("myFactoryBean");
		System.out.println(user1);
	}

}
