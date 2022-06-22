package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex03.component.MyComponent;

/*
 * Application Context 가 구성된 이 후, 실행할 코드가 있는 경우(Application Context 환경에 의존적 Bean 사용한다는 거 ㅇㅇ) 가 있는 경우 
 * ApplicationRunner 인터페이스 구현 클래스(HelloWorldRunner) 빈 사용하기 
 * 						
 */
@SpringBootConfiguration
public class MyApplication {
	@Bean
	public ApplicationRunner applicationRunner() {
		//1. 작성된 구현 클래스를 사용하는 방법
		//return new HelloWorldRunner();
		
		//2 익명 클래스 사용 
//		return new ApplicationRunner() {
//			
//			@Autowired
//			private MyComponent myComponent;
//			
//			@Override
//			public void run(ApplicationArguments args) throws Exception {
//				myComponent.printHelloWorld();
//				
//			}
//			
//		};
		return null;
		
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {}
		System.out.println("hello world");
	}
}
