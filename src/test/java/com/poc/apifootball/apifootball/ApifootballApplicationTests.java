package com.poc.apifootball.apifootball;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApifootballApplicationTests {
	
	@Autowired 
	ApifootballController apiFootballController;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetId() throws IOException {
		
		Country country = new Country();
		apiFootballController.getId(1L);
		
	}

}
