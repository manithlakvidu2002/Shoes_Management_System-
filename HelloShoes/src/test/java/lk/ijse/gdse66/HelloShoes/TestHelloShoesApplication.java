package lk.ijse.gdse66.HelloShoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestHelloShoesApplication {

	public static void main(String[] args) {
		SpringApplication.from(HelloShoesApplication::main).with(TestHelloShoesApplication.class).run(args);
	}

}
