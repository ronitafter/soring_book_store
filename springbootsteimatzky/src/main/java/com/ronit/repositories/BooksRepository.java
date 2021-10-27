package com.ronit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Book;


@Repository
public interface BooksRepository extends JpaRepository<Book, Integer>{
	Book findByGenreId(int id);
	
//	@Transactional
//	@Modifying
//	@Query(value = "update books set discount = discount-5 where code=:id", nativeQuery = true)
//	void newdiscount(@Param("id") int bookid);
	
}
