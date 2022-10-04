package com.greenfoxacademy.listingtodos.Controllers;

import com.greenfoxacademy.listingtodos.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo")
    public String renderTodo() {
        return "todo";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("todos",todoRepository.findAll());
        return "todolist";
    }
}
