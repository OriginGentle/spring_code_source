package com.spring.selfTag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ycb
 * @Date 2021/3/20-16:53
 */
@Configuration
public class MyService {

	@Bean
	public String show(){
		return "peter";
	}
}
