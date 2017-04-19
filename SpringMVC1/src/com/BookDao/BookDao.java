package com.BookDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Book;

@Repository
public class BookDao {
	
	public List<Book> getBookDetails()
	{
		Book b = new Book();
		b.setBookName("C++");
		b.setAuthorname("balaguruswamy");
		b.setPrice(324);
		
		Book b1 = new Book();
		b1.setBookName("C++");
		b1.setAuthorname("balaguruswamy");
		b1.setPrice(324);
		
		Book b2 = new Book();
		b2.setBookName("C++");
		b2.setAuthorname("balaguruswamy");
		b2.setPrice(324);
		
		List<Book> lb = new ArrayList<Book>();
		lb.add(b);
		lb.add(b1);
		lb.add(b2);
		
		return lb;
		
	}

}
