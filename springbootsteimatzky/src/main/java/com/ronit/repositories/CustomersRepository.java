package com.ronit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Customer;


@Repository
public interface CustomersRepository extends JpaRepository<Customer, Integer>{
	Customer findByAge(int age);

}
