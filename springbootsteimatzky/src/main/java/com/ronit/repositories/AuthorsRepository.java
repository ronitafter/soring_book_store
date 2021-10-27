package com.ronit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Author;


@Repository
public interface AuthorsRepository extends JpaRepository<Author, Integer>{

}
