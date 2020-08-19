package edu.trade.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@SpringBootApplication
@ComponentScan(basePackages="com.bofa.kyc.*")
@EnableJpaRepositories(basePackages="com.bofa.kyc.*")
@EntityScan(basePackages="com.bofa.kyc.*")
public class TradeApplication {


	public static void main(String[] args) {
		SpringApplication.run(TradeApplication.class, args);
		/*String[] appArgs = {"--debug"};
		SpringApplication app=new SpringApplication(EKycApplication.class);
		app.setLogStartupInfo(false);
		app.run(appArgs);*/
	}

}
