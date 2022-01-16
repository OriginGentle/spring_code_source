package com.spring.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ycb
 * @since 2022/1/15-18:44
 */
public class MyCglib implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		Object o1 = methodProxy.invokeSuper(o, objects);
		return o1;
	}
}
