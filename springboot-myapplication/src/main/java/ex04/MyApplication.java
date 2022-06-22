package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/*
 * SpringBootApplication 메타 어노테이션 여러기능 합쳐서 가지고 있는거 
 * 
 * @SpringBootConfiguration + @ComponentScan							
 */
@SpringBootConfiguration
public class MyApplication {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {}
	}
}
