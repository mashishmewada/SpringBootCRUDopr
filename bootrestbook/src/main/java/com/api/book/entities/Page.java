package com.api.book.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pageId;
	private int pageNumber;
	private String content;
	private String chapter;
	
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Page(int pageId, int pageNumber, String content, String chapter) {
		super();
		this.pageId = pageId;
		this.pageNumber = pageNumber;
		this.content = content;
		this.chapter = chapter;
	}
	
	

}
