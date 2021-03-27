package com.spring.observer;

/**
 * @Author ycb
 * @Date 2021/3/21-14:44
 */
public class GoodMan implements Observer {
	@Override
	public void make(String str) {
		System.out.println("采取的策略是:");
		System.out.println(str);
	}
}
