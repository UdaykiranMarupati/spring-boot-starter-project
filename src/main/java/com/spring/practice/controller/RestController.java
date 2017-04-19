package com.spring.practice.controller;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.practice.model.PracticeModelRequest;
import com.spring.practice.model.PracticeModelResponse;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/sum")
public class RestController {

	@RequestMapping(method = RequestMethod.POST)
	public PracticeModelResponse create(@RequestBody PracticeModelRequest practiceModel) throws com.spring.practice.customerexcetions.BadRequestException {
		if (practiceModel.getElement1() == null || practiceModel.getElement2() ==null) {
			throw new  com.spring.practice.customerexcetions.BadRequestException(practiceModel.getElement1() ==null ? "Element1 cannot be null": "Element2 cannot be null");
		}
		PracticeModelResponse response = new PracticeModelResponse();
		response.setSum(practiceModel.getElement1() + practiceModel.getElement2());
		return response;
	}
	
}
	