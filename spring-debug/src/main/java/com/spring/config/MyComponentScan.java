package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ycb
 * @Date 2021/3/20-14:59
 */
@Configuration
@ComponentScan("com.spring.selfTag")
public class MyComponentScan {

	@ComponentScan("com.spring.selfTag")
	@Configuration
	class InnerClass{

	}
}
