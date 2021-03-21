package com.spring.shouldSkip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ycb
 * @Date 2021/3/20-15:06
 */
@Conditional(WindowsCondition.class)
@Configuration
public class BeanConfig {

	@Bean(name = "bill")
	public Person person1() {
		return new Person("Bill Gates", 45);
	}

	@Bean("linus")
	public Person person2() {
		return new Person("linus", 54);
	}

}
