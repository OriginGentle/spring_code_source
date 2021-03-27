package com.spring.factoryBean;

import com.spring.supplier.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author ycb
 * @Date 2021/3/27-1:12
 */
public class MyFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User("peter");
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
