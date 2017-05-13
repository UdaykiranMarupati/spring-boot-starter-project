package com.spring.practice.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>, JpaSpecificationExecutor  {
	List<Customer> findByLastName(String lastName);
	Long countByLastName(String lastName);
	
	@Query("select * from Customer c where c.lastName = ?1")
	List<Customer> findByLastNameWithQuery(String name);
}
