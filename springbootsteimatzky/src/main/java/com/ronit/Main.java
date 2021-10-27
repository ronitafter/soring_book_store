package com.ronit;

import java.util.ArrayList;
import java.util.List;

//import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ronit.beans.Author;
import com.ronit.beans.Book;
import com.ronit.repositories.AuthorsRepository;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext Context = SpringApplication.run(Main.class);
//		Customer customer = new Customer("", 30, new Date(0), null);
//		Author author = new Author( "name", 30, {List<Book> books = new ArrayList<Book>()});
//		CustomersRepository customersrepository = Context.getBean(CustomersRepository.class);
		AuthorsRepository authorsrepository = Context.getBean(AuthorsRepository.class);
		Author author = new Author("abc", 30);
//		List<Book> books = new ArrayList<Book>();
//		author.setBooks(books);
		authorsrepository.save(author);
//		authorsrepository.save(author);

	}

}
