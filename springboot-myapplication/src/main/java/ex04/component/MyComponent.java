package ex04.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyComponent implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("do something1....");
		System.out.println("do something2....");
		System.out.println("do something3....");
		System.out.println("do something4....");
	}

}
