package com.api.book.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "totalBookPage")
public class BookPage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookPage_id;
	private int numberOfChapter;
	private int totalPage;
	
	public BookPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookPage(int bookPage_id, int numberOfChapter, int totalPage) {
		super();
		this.bookPage_id = bookPage_id;
		this.numberOfChapter = numberOfChapter;
		this.totalPage = totalPage;
	}
	
	

}
