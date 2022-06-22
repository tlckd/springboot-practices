package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
 * SpringBoot Test Integraiton 기반 
 * Error: Spring Boot Test Integration(@SpringBootTest) 에서는 
 * @Configuration을 달고 있는 설정 클래스는 자동(스캔) 하지 못한다. 
 * 스프링부트컨피그레이션이나 이걸 포함시키고 있는 @SpringBootApplication 을 써야함 
 */
//@SpringBootTest(classes={MyApplication.class})
@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
