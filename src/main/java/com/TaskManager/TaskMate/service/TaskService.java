package com.TaskManager.TaskMate.service;

import com.TaskManager.TaskMate.model.Task;
import com.TaskManager.TaskMate.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // CREATE
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // READ - Get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // READ - Get task by ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // UPDATE
    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(task);
        }).orElse(null);
    }

    // DELETE
    public boolean deleteTask(Long id) {
        if(taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
