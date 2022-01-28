package com.spring.tx.annotation.service;

import com.spring.tx.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ycb
 * @since 2022/1/27-15:48
 */
@Service
public class BookService {

	@Autowired
	BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	/**
	 * 结账：传入哪个用户买了哪本书
	 *
	 * @param username
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public void checkout(String username, int id) {
		bookDao.updateStock(id);
		int price = bookDao.getPrice(id);
		bookDao.updateBalance(username, price);
	}
}
