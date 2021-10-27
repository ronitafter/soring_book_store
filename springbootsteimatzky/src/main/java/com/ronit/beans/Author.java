package com.ronit.beans;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//customers_books one to many
@Entity
@Table(name = "author")
public class Author {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@Column(name = "name")
	private String name;
	private int age;
	@OneToMany(mappedBy = "author") // ?
	private List<Book> book;
	
	public Author() {
		
	}
	
	public Author(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Author(String name, int age, List<Book> book) {
		this(name, age);
		this.book = book;
	}
	
	public Author(int id, String name, int age, List<Book> book) {
		this(name, age, book);
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Book> getBooks() {
		return book;
	}

	public void setBooks(List<Book> books) {
		this.book = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", age=" + age + ", books=" + book + "]";
	}
	
	


}
