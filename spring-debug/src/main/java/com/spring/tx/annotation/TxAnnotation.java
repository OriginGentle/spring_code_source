package com.spring.tx.annotation;

import com.spring.tx.annotation.config.TransactionConfig;
import com.spring.tx.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ycb
 * @since 2022/1/27-15:45
 */
public class TxAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(TransactionConfig.class);
		applicationContext.refresh();
		BookService bean = applicationContext.getBean(BookService.class);
		bean.checkout("zhangsan",1);
	}
}
