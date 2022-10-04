package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.Controllers.TodoController;
import com.greenfoxacademy.listingtodos.Models.Todo;
import com.greenfoxacademy.listingtodos.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public ListingTodosApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }



    public ListingTodosApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingTodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Todo todo1 = new Todo("I have to learn Object Relational Mapping");
        Todo todo2 = new Todo("I have to learn SQL");
        Todo todo3 = new Todo("I have to learn Spring Data JPA");

        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);

        System.out.println(todo1);
    }
}
