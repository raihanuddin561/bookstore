package com.bookstoreadminportal.service;

import java.util.List;

import com.bookstoreadminportal.model.Book;

public interface BookService {
	Book save(Book book);

	List<Book> getBookList();
}
