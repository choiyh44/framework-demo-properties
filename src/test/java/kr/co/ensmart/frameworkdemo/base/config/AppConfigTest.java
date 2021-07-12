package kr.co.ensmart.frameworkdemo.base.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
//(properties = "spring.config.location=classpath:/application.yml")
@Slf4j
class AppConfigTest {

	@Autowired
	private Environment environment;
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.env}")
	private String appEnv;
	
	@Test
	@Profile("local")
	void testLocal() {
		log.info("[local] env.string: {}", environment.getProperty("env.string"));
		log.info("[local] domain.string: {}", environment.getProperty("domain.string"));
		log.info("[local] app.name: {}", environment.getProperty("app.name"));
		log.info("[local] app.env: {}", environment.getProperty("app.env"));
		log.info("[local] appName: {}", "appName");
		log.info("[local] appEnv: {}", "appEnv");
	}

	@Test
	@Profile("dev")
	void testDev() {
		log.info("[dev] env.string: {}", environment.getProperty("env.string"));
		log.info("[dev] domain.string: {}", environment.getProperty("domain.string"));
		log.info("[local] app.name: {}", environment.getProperty("app.name"));
		log.info("[local] app.env: {}", environment.getProperty("app.env"));
		log.info("[local] appName: {}", "appName");
		log.info("[local] appEnv: {}", "appEnv");
	}

}
