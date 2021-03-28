package com.spring.selfBDRPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @Author ycb
 * @Date 2021/3/18-21:06
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行postProcessBeanFactory方法====MyBeanDefinitionRegistryPostProcessor");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行postProcessBeanDefinitionRegistry方法===MyBeanDefinitionRegistryPostProcessor");
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MySelfBeanDefinitionRegistryPostProcessor.class);
		builder.addPropertyValue("name", "张三");
		registry.registerBeanDefinition("peter", builder.getBeanDefinition());
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
