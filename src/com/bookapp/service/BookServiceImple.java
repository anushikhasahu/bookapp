package com.bookapp.service;

import java.util.ArrayList;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImple implements BookService {

	 ArrayList<Book> booklist = new ArrayList<>();
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		booklist.add(book);
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
		 ArrayList<Book> booklistbyAuthor = new ArrayList<>();
		for (Book book : booklist) {
			if(book.getAuthor().equalsIgnoreCase(author))
				booklistbyAuthor.add(book);
		}
		if(!booklistbyAuthor.isEmpty())
		return booklistbyAuthor;
		else
			throw new BookNotFoundException("book not found");
	}

	@Override
	public Book getbyId(int id) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
