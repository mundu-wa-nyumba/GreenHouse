package com.mwn.Greenhouse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreenhouseApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private HealthEndpoint healthEndpoint;

	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
		// This test will fail if the application context cannot be loaded
	}

	@Test
	void applicationStarts() {
		GreenhouseApplication.main(new String[] {});
		// This test will fail if the application cannot be started
	}


	@Test
	void testHealthEndpoint() {
		assertThat(healthEndpoint.health().getStatus()).isEqualTo(Status.UP);
	}

	@Test
	void testRestDataEndpoint() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/api/data", String.class);
		assertThat(response.getStatusCode().is2xxSuccessful()).isTrue();
	}

	// Add more tests in this class to test the application
}