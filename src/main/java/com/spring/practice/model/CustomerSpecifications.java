package com.spring.practice.model;

import org.springframework.data.jpa.domain.Specification;

public class CustomerSpecifications {
	 public static Specification<Customer> customerNameEquals(String name) {
		    return (root, query, cb) -> 
		         cb.equal(root.get(Customer_.lastName), name);
		  }
}
