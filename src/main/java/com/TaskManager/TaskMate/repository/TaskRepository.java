package com.TaskManager.TaskMate.repository;

import com.TaskManager.TaskMate.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findByTitleAndCompleted(String title, boolean completed);

}
