package kr.co.ensmart.frameworkdemo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleService {
	@Autowired
	private Environment environment;
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.env}")
	private String appEnv;

	@Value("${env.string}")
	private String envString;

	@Value("${domain.string}")
	private String domainString;

	public void viewMain() {
		log.info("[local] env.string: {}", environment.getProperty("env.string"));
		log.info("[local] domain.string: {}", environment.getProperty("domain.string"));
		log.info("[local] app.name: {}", environment.getProperty("app.name"));
		log.info("[local] app.env: {}", environment.getProperty("app.env"));
		log.info("[local] envString: {}", envString);
		log.info("[local] domainString: {}", domainString);
		log.info("[local] appName: {}", appName);
		log.info("[local] appEnv: {}", appEnv);
	}

}
