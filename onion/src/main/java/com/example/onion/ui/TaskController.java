package com.example.onion.ui;

import com.example.onion.application.domainservice.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskRepo taskRepo;

    public List<TaskResponse> getAllTasks() {
        return TaskResponse.of(taskRepo.queryAllTask());
    }
}
