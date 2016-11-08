package biz.cosee.candyshop;

import biz.cosee.candyshop.dynamodb.CalorieMeterRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableJpaRepositories(excludeFilters = {
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = CalorieMeterRepository.class)})
public class SpringDataDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}
}
