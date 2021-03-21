package com.spring.selfBDRPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @Author ycb
 * @Date 2021/3/18-21:28
 */
public class MySelfBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用执行postProcessBeanFactory---MySelfBeanDefinitionRegistryPostProcessor");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("peter");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("调用执行postProcessBeanDefinitionRegistry---MySelfBeanDefinitionRegistryPostProcessor");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
