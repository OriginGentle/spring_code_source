package com.spring.aop.annotation;

import com.spring.aop.annotation.config.SpringConfiguration;
import com.spring.aop.annotation.service.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ycb
 * @since 2022/1/9-16:47
 */
public class TestAnnotationAop {
	public static void main(String[] args) throws NoSuchMethodException {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(SpringConfiguration.class);
		ac.refresh();
		MyCalculator bean = ac.getBean(MyCalculator.class);
		System.out.println(bean.add(1, 1));
	}
}
