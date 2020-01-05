package com.bookstoreadminportal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.bookstoreadminportal.model.Book;
import com.bookstoreadminportal.service.BookService;
import com.bookstoreadminportal.utility.ImageUtility;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addBook(Model model) {
		Book book = new Book();
		model.addAttribute(book);
		return "addBook";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addBookPost(@ModelAttribute("book") Book book,HttpServletRequest request) {
		bookService.save(book);
		MultipartFile bookImage = book.getBookImage();
		ImageUtility.saveImage(bookImage,book);
		
		return "redirect:bookList";
	}
	
	@RequestMapping(value="/bookList")
	public String bookList(Model model) {
		List<Book> bookList = bookService.getBookList();
		model.addAttribute("bookList",bookList);
		return "bookList";
	}
}
