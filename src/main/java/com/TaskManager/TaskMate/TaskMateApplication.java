package com.TaskManager.TaskMate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @EntityScan("com.TaskManager.model") //
//@ComponentScan(basePackages = {"com.TaskManager.controller","com.TaskManager.repository","com.TaskManager.model","com.TaskManager.service"})
public class TaskMateApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaskMateApplication.class, args);
    }
}