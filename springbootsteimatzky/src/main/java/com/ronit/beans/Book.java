package com.ronit.beans;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
//	@ManyToOne(cascade = CascadeType.ALL)
	@ManyToOne
//	@JoinColumn(name = "id")
	@JoinColumn
	private Author author;
	@Column(name = "genre_id")
	private int genreId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "customers_books", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "customer_id"))
	private Customer customer;

	public Book() {

	}

	public Book(String name, Author author, int genreId) {
		this.name = name;
		this.author = author;
		this.genreId = genreId;
	}

	public Book(int id, String name, Author author, int genreId) {
		this(name, author, genreId);
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", genreId=" + genreId + "]";
	}

}
