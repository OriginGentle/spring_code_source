package com.spring.tx.xml;

import com.spring.tx.xml.service.BookService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author ycb
 * @since 2022/1/27-14:35
 */
public class TxTest {

	public static void main(String[] args) throws SQLException {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
		ApplicationContext context = new ClassPathXmlApplicationContext("txConfig.xml");
		BookService bookService = context.getBean("bookService", BookService.class);
		bookService.checkout("zhangsan",1);
	}
}
