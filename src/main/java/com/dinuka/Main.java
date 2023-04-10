package com.dinuka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetingResponse greeting() {
        Person person = new Person("Dinuka", 27, 30_000);
        GreetingResponse response = new GreetingResponse("Hello", List.of("Java", "Python", "JavaScripts"), person);
        return response;
    }

    record Person(String name, int age, double savings) {
    }

    record GreetingResponse(String greet, List<String> favouriteLanguages, Person person) {
    }
}
