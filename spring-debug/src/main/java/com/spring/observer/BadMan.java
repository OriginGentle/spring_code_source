package com.spring.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ycb
 * @Date 2021/3/21-14:34
 */
public class BadMan implements Observable {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver(String str) {
		for (Observer observer : observers) {
			observer.make(str);
		}
	}

	public void run() {
		System.out.println("罪犯要逃跑了");
		this.notifyObserver("追击罪犯");
	}

	public void play() {
		System.out.println("罪犯在玩");
		this.notifyObserver("静观其变");
	}
}
