package jpabook.jpashop;

import jpabook.jpashop.domain.item.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpashopApplication.class, args);
	}

}
