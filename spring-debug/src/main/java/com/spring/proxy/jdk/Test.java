package com.spring.proxy.jdk;

/**
 * @author ycb
 * @since 2022/1/15-18:43
 */
public class Test {

	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
		proxy.add(1, 1);
		System.out.println(proxy.getClass());
	}
}
