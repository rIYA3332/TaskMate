package com.TaskManager.service;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public String getAllTasks() {
        return "Task list will come from DB in upcoming days";
    }
}
