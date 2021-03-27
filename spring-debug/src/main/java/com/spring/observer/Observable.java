package com.spring.observer;

/**
 * @Author ycb
 * @Date 2021/3/21-14:31
 * @Description 被观察者
 */
public interface Observable {

	public void addObserver(Observer observer);

	public void deleteObserver(Observer observer);

	public void notifyObserver(String str);

}
