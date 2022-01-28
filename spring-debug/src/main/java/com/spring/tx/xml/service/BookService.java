package com.spring.tx.xml.service;

import com.spring.tx.xml.dao.BookDao;

/**
 * @author ycb
 * @since 2022/1/27-14:36
 */
public class BookService {

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
	public void checkout(String username, int id) {

		try {
			bookDao.updateStock(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
//        for (int i = 1 ;i>=0 ;i--)
//            System.out.println(10/i);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
	}
}
