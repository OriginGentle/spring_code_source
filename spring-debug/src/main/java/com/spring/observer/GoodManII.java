package com.spring.observer;

/**
 * @Author ycb
 * @Date 2021/3/21-14:46
 */
public class GoodManII implements Observer {
	@Override
	public void make(String str) {
		System.out.println("第二组行动");
		System.out.println(str);
	}
}
