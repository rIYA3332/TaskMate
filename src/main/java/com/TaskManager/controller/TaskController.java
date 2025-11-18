package com.TaskManager.controller;

import com.TaskManager.model.Task;
import com.TaskManager.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    @GetMapping("/")
    public String home() {
        return "TaskMate is running! Use POST /tasks to create a task.";
    }
}
