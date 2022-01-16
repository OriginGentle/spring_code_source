package com.spring.proxy.jdk;

/**
 * @author ycb
 * @since 2022/1/15-18:41
 */
public class MyCalculator implements Calculator {

	public int add(int i, int j) {
		int result = i + j;
		return result;
	}

	public int sub(int i, int j) {
		int result = i - j;
		return result;
	}

	public int mult(int i, int j) {
		int result = i * j;
		return result;
	}

	public int div(int i, int j) {
		int result = i / j;
		return result;
	}
}
