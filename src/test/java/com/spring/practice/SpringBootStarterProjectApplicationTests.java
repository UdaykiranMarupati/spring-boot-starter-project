package com.spring.practice;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.practice.model.PracticeModelResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootStarterProjectApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	@Test
	public void countTest() {
		ResponseEntity<PracticeModelResponse> response = restTemplate
				.getForEntity("http://localhost:" + port + "/count/Bauer", PracticeModelResponse.class);
		assertNotNull(response);
	}

}
