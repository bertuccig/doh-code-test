package net.dinove.doh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {


        System.out.println("net.dinove.doh.Application start");
    }

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);
    }
}