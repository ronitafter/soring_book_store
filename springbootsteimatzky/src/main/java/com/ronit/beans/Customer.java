package com.ronit.beans;

import java.sql.Date;

import java.util.List;
import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	@Column(name = "join_date")
	private Date joinDate;
	@ManyToMany
	@JoinTable(name = "customers_books", joinColumns = @JoinColumn(name = "customer_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<Book> book;

	public Customer() {

	}

	public Customer(String name, int age, Date joinDate, List<Book> book) {
		this.name = name;
		this.age = age;
		this.joinDate = joinDate;
		this.book = book;
	}

	public Customer(int id, String name, int age, Date joinDate, List<Book> books) {
		this(name, age, joinDate, books);
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

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public List<Book> getBooks() {
		return book;
	}

	public void setBooks(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", joinDate=" + joinDate + ", books=" + book
				+ "]";
	}

}
