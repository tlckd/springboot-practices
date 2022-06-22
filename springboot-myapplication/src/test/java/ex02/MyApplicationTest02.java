package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
 * SpringBoot Test Integraiton 기반 
 * 
 * SpringBoot Test Integraiton(@SpringBootTest) 에서는 
 * 자동(스캔)을 위해서 설정 클래스에 @SpringBootConfiguration 을 달아줘야 한다.
 * 
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

