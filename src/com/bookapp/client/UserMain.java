
package com.bookapp.client;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImple;

public class UserMain {

	public static void main(String[] args) throws BookNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		
		BookService service = new BookServiceImple();
		Scanner sc = new Scanner(System.in);	
		for (int i = 0; i < 3; i++) {
			System.out.println("enter book author :");
			String author = sc.next();	
			System.out.println("enter book title :");
			String title = sc.next();
			System.out.println("enter book category :");
			String category = sc.next();
			System.out.println("enter book id :");
			int bookid = sc.nextInt();		
			Book book = new Book(title, author, bookid, category);	
			service.addBook(book);		
			System.out.println("book added");	
			}	
		System.out.println("All books");	
		for (Book book : service.getBookByAuthor(null)) {
			System.out.println(book);	
			}	
		System.out.println();	
		System.out.println("By Author");	
		List<Book> bookbyAuthor = null;	
		String author = sc.next();	
		try {		
			bookbyAuthor = service.getBookByAuthor(author);	
			Collections.sort(bookbyAuthor,(b1,b2)->b1.getTitle().compareTo(b2.getTitle()));	
			for (Book book : bookbyAuthor) {			
				System.out.println(book);		
				}		
			} catch (BookNotFoundException e) {	
				System.out.println(e.getMessage());	
				}		
		System.out.println();
		Book book;	
		try {		
			book = service.getbyId(10);
			System.out.println(book);	
			} catch (BookNotFoundException e) {	
				System.out.println(e.getMessage());	
				}		
		
		
		
	/*	
		
		BookService service = new BookServiceImple();
		service.addBook(new Book(" java in action", "keet", 11, "tech"));

		List<Book> bookbyAuthor = service.getBookByAuthor("keet");
//Collections sort(bookbyAuthor,(b1,b2)->b1.getTitle.equals)
		for (Book book : bookbyAuthor) {
			System.out.println(book);
		}
		
		
		
		*/
		
	}

}
