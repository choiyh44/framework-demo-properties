package kr.co.ensmart.frameworkdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = { "spring.profiles.active=local" })
class FrameworkDemoPropertiesApplicationTests {

	@Test
	void contextLoads() {
	}

}
