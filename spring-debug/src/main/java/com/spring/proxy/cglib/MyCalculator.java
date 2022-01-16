package com.spring.proxy.cglib;

/**
 * @author ycb
 * @since 2022/1/15-18:43
 */
public class MyCalculator {

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
