package cn.shuoshuge.entity;

import java.sql.Timestamp;

public class Book_library_card {
	
	private Integer id;
	private Timestamp borrow_date;
	private Integer library_card_id;
	private Integer book_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Timestamp getBorrow_date() {
		return borrow_date;
	}
	public void setBorrow_date(Timestamp borrow_date) {
		this.borrow_date = borrow_date;
	}
	public Integer getLibrary_card_id() {
		return library_card_id;
	}
	public void setLibrary_card_id(Integer library_card_id) {
		this.library_card_id = library_card_id;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	

}
