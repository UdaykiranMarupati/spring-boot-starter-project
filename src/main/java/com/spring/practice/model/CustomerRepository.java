package com.spring.practice.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>, JpaSpecificationExecutor  {
	List<Customer> findByLastName(String lastName);
	Long countByLastName(String lastName);
}
