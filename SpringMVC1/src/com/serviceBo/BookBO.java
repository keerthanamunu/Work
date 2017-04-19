package com.serviceBo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookDao.BookDao;
import com.entity.Book;

@Service
public class BookBO {

	@Autowired
	BookDao bookDao;
	
	public List<Book> getBookDetails()
	{
		List<Book> lb=bookDao.getBookDetails();
		return lb;
	}
	
}
