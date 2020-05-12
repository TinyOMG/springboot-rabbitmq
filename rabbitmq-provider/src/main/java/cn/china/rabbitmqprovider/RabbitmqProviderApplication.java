package cn.china.rabbitmqprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"receiver","exchange"})
public class RabbitmqProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProviderApplication.class, args);
	}

}
