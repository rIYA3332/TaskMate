package com.TaskManager.TaskMate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.TaskManager.model") //
public class TaskMateApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaskMateApplication.class, args);
    }
}