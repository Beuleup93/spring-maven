package com.example.demo_github;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoGithubApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals(20, 12+8, "Assertion volontairement fausse pour voir l'echec du workflow");
	}

}
