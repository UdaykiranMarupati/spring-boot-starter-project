package com.spring.practice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.practice.model.PracticeModelRequest;
import com.spring.practice.model.PracticeModelResponse;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/sum")
public class RestController {

	@RequestMapping(method = RequestMethod.POST)
	public PracticeModelResponse create(@RequestBody PracticeModelRequest practiceModel) {
		PracticeModelResponse response = new PracticeModelResponse();
		response.setSum(practiceModel.getElement1() + practiceModel.getElement2());
		return response;
	}
	
}
