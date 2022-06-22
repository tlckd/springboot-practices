package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplication {
	
	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	
	//컨테이너에서 이 메소드는 무시.. 어노테이션 안달려있으니깐 그냥 자바에서 실행하는거 
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {}
	}
}
