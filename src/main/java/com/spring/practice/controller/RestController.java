package com.spring.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.practice.model.Customer;
import com.spring.practice.model.CustomerRepository;
import com.spring.practice.model.CustomerSpecifications;
import com.spring.practice.model.PracticeModelRequest;
import com.spring.practice.model.PracticeModelResponse;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(value = "/sum", method = RequestMethod.POST)
	public PracticeModelResponse create(@RequestBody PracticeModelRequest practiceModel)
			throws com.spring.practice.customerexcetions.BadRequestException {
		if (practiceModel.getElement1() == null || practiceModel.getElement2() == null) {
			throw new com.spring.practice.customerexcetions.BadRequestException(
					practiceModel.getElement1() == null ? "Element1 cannot be null" : "Element2 cannot be null");
		}
		PracticeModelResponse response = new PracticeModelResponse();
		response.setSum(practiceModel.getElement1() + practiceModel.getElement2());
		return response;
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public PracticeModelResponse countByLastName(@RequestBody PracticeModelRequest practiceModel)
			throws com.spring.practice.customerexcetions.BadRequestException {
		if (practiceModel.getElement1() == null || practiceModel.getElement2() == null) {
			throw new com.spring.practice.customerexcetions.BadRequestException(
					practiceModel.getElement1() == null ? "Element1 cannot be null" : "Element2 cannot be null");
		}
		PracticeModelResponse response = new PracticeModelResponse();
		response.setSum(practiceModel.getElement1() + practiceModel.getElement2());
		return response;
	}
	

	@RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
	public List<Customer> countByLastName(@RequestParam("name") String name)
			throws com.spring.practice.customerexcetions.BadRequestException {
		return customerRepository.findAll(Specifications.where(CustomerSpecifications.customerNameEquals(name)));
	}

}
