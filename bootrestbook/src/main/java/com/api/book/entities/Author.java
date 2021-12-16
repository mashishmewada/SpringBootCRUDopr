package com.api.book.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	private String firstName;
	private String lastName;
	private String language;
	
	public Author() {
		super();
		
	}
	public Author(int authorId, String firstName, String lastName, String language) {
		super();
		
		this.authorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
	}
	
	
}
