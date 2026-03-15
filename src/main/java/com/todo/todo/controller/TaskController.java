package com.todo.todo.controller;

import com.todo.todo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.todo.todo.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/task")

public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTask() {
        return taskService.getAllTask();
    }

    @PostMapping("/register")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
}
