package com.example.springbootdemo;

import com.example.springbootdemo.todo.TodoItem;
import com.example.springbootdemo.todo.TodoItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    String sayHello() {
        return "Hello";
    }

}

@Slf4j
@Transactional
@Component
class Initializer {

    @Bean
    CommandLineRunner initDatabase(TodoItemRepository repository) {
        return args -> {
            repository.save(new TodoItem("Foo", false));
            repository.save(new TodoItem("Bar", true));
            log.info("Test beans created");
        };
    }

}
