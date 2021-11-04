package com.vidiyalas.bank;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@SpringBootApplication(scanBasePackages = "com.vidiyalas.bank")
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
		
	}
}*/
@SpringBootApplication
@ComponentScan("com.sandbox")
public class BankingAppApplication implements ApplicationRunner {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(BankingAppApplication.class, args);
    }

    public void run(ApplicationArguments args) throws Exception {

    }
}
