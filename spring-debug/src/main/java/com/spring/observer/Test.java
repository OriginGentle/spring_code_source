package com.spring.observer;

/**
 * @Author ycb
 * @Date 2021/3/21-14:47
 */
public class Test {
	public static void main(String[] args) {
		// 被观察者
		BadMan badMan = new BadMan();
		// 观察者
		GoodMan goodMan = new GoodMan();
		GoodManII goodManII = new GoodManII();

		// 添加观察者
		badMan.addObserver(goodMan);
		badMan.addObserver(goodManII);

		// 触发行为
		badMan.run();

	}
}
