package com.spring.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.practice.model.PracticeModelRequest;
import com.spring.practice.model.PracticeModelResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootStarterProjectApplicationTests {

	@Inject
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	@Test
	public void countTest() {
		ResponseEntity<PracticeModelResponse> response = restTemplate
				.getForEntity("http://localhost:" + port + "/count/Bauer", PracticeModelResponse.class);
		assertNotNull(response);
		assertEquals(new Long(2), response.getBody().getSum());
	}

	@Test
	public void countTest2() {
		ResponseEntity<PracticeModelResponse> response = restTemplate
				.getForEntity("http://localhost:" + port + "/count/Palmer", PracticeModelResponse.class);
		assertNotNull(response);
	}

	@Test
	public void sumTest() {

		PracticeModelRequest request = new PracticeModelRequest();
		request.setElement1(1);
		request.setElement2(100);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<PracticeModelRequest> entity = new HttpEntity<PracticeModelRequest>(request, headers);
		ResponseEntity<PracticeModelResponse> response = restTemplate
				.postForEntity("http://localhost:" + port + "/sum", entity, PracticeModelResponse.class);
		assertNotNull(response);
	}

}
