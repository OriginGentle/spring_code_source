package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @Author ycb
 * @Date 2021/3/20-14:59
 */
@Configuration
@ComponentScan("com.spring.shouldSkip")
public class MyComponentScan {

	@ComponentScan("com.spring.shouldSkip")
	@Configuration
	@Order(1)
	class InnerClass{

	}
}
