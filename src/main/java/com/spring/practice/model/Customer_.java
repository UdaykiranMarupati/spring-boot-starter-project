package com.spring.practice.model;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Customer.class)
public class Customer_ {
	  
	  public static volatile SetAttribute<Customer, String> lastName;
}
