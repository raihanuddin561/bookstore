package com.bookstoreadminportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstoreadminportal.model.Book;
import com.bookstoreadminportal.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;
	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}
	@Override
	public List<Book> getBookList() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}
	
	

}
