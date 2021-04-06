package com.bookapp.model;

public class Book {
private String title;
private String author;
private int  bookid;
private String category;
public Book(String title, String author, int bookid, String catrgory) {
	super();
	this.title = title;
	this.author = author;
	this.bookid = bookid;
	this.category = category;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}


}
