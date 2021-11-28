package com.spring.methodOverrides;

import com.spring.methodOverrides.lookup.Apple;
import com.spring.methodOverrides.lookup.FruitPlate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ycb
 * @Date 2021/3/27-16:18
 * <p>
 * spring中默认的对象都是单例的，spring会在一级缓存中持有该对象，方便下次直接获取，
 * 那么如果是原型作用域的话，会每次创建一个新的对象
 * <p>
 * 如果想在一个单例模式的bean下引用一个原型模式的bean,怎么办？
 * 在此时就需要引用lookup-method标签来解决此问题
 * <p>
 * 通过拦截器的方式每次需要的时候都去创建最新的对象，而不会把原型对象缓存起来
 */
public class TestMethodOverride {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("methodOverride.xml");

		FruitPlate fruitPlate1 = (FruitPlate) ac.getBean("fruitPlate1");
		fruitPlate1.getFruit();
		System.out.println("************************************************");
		FruitPlate fruitPlate2 = (FruitPlate) ac.getBean("fruitPlate2");
		fruitPlate2.getFruit();

		System.out.println("================================================");

		Apple apple = ac.getBean(Apple.class);
		System.out.println(apple.getBanana());
		System.out.println(apple.getBanana());
	}
}
