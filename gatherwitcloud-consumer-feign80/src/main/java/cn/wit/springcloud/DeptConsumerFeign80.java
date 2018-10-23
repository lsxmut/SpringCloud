package cn.wit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerFeign80 {
	
	public static void main(String[] args) {
		
		SpringApplication.run(DeptConsumerFeign80.class, args);
		
	}

}
