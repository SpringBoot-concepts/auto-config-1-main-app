package com.dev.auto.config;

import com.dev.auto.config.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoConfig1MainAppApplication implements CommandLineRunner {

    @Autowired
    TransactionService transactionService;

    public static void main(String[] args) {
        SpringApplication.run(AutoConfig1MainAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(transactionService.getBeneName());
    }
}
