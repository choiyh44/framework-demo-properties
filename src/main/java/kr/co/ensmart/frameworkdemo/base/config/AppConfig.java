package kr.co.ensmart.frameworkdemo.base.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:application.yml")
@PropertySource("classpath:config/env-${spring.profiles.active}.properties")
@PropertySource("classpath:config/domain-${spring.profiles.active}.properties")
public class AppConfig {

}
