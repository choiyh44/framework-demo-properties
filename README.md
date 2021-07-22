# framework-demo-properties

## Spring Property 사용법
1. Environment environment 사용하는 경우

- application.yml / application.properties 에 key / value 값을 정의한다.

- spring bean java 파일에 Environment environment를 autowire  한다.

```
...
	@Autowired
	private Environment environment;
...
```
- environment.getProperty("env-key") 메소드

```
...
		log.info("[local] env.string: {}", environment.getProperty("env.string"));
		log.info("[local] domain.string: {}", environment.getProperty("domain.string"));
		log.info("[local] app.name: {}", environment.getProperty("app.name"));
...
```

2. @Value 어노테이션을 사용하는 경우

- application.yml / application.properties 에 key / value 값을 정의한다.

- @Value 어노테이션을 붙여서 필드를 생성한다.

```
...
	@Value("${env.string}")
	private String envString;

	@Value("${domain.string}")
	private String domainString;
  
	@Value("${app.name}")
	private String appName;	
...
```
- 생성한 필드를 사용한다.
```
...
		log.info("[local] envString: {}", envString);
		log.info("[local] domainString: {}", domainString);
		log.info("[local] appName: {}", appName);
...
```
3. application.yml / application.properties 이외의 추가적인 파일을 사용하고 싶을때
- 추가적인파일을 클래스패스에 생성한다.(보통은 /resource/** 아래에 생성)
- @Configuration 클래스를 추가하여 추가 파일 경로를 지정한다. 이때 profile을 고려하여 파일명을 지정한다.
- 이후 application.yml/application.properties 에 지정한 key/value 값 사용시와 동일하게 사용한다.
```
...
@Configuration
@PropertySource("classpath:config/env-${spring.profiles.active}.properties")
@PropertySource("classpath:config/domain-${spring.profiles.active}.properties")
public class AppConfig {

}
...
```


