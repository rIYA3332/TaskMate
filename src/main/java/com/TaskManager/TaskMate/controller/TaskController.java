package com.TaskManager.TaskMate.controller;

import com.TaskManager.TaskMate.model.Task;
import com.TaskManager.TaskMate.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // CREATE
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // READ - Get all
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // READ - Get by ID
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        boolean deleted = taskService.deleteTask(id);
        return deleted ? "Task deleted successfully" : "Task not found";
    }

    @GetMapping("/test")
    public String home() {
        return "TaskMate is running!";
    }
}
