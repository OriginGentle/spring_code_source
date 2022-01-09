package com.spring.aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ycb
 * @since 2022/1/9-16:46
 */
@Configuration
@ComponentScan(basePackages = "com.spring.aop.annotation")
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
