package com.cts.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EcommerceApplicationTests {

	@Test
	void contextLoads() {
		// Testing if spring working correctly!
	}

	
	@Test
    public void main() {
        // Test the main method to ensure it runs without exceptions
        String[] args = {};
        EcommerceApplication.main(args);
    }
	
}
