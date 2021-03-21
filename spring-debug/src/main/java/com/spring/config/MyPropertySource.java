package com.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author ycb
 * @Date 2021/3/20-15:01
 */
@Configuration
@PropertySource({"classpath:myConfig.properties"})
public class MyPropertySource {

	@Value("root")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
