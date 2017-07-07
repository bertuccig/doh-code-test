package net.dinove.doh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

    @Autowired
    FizBuzzService service;

    @Override
    public void run(String... args) throws Exception {

        int[] sample = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        service.printFizzBuzzSequence(sample);
    }

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);
    }
}