package com.spring.selfTag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Author ycb
 * @Date 2021/2/3-21:57
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}
