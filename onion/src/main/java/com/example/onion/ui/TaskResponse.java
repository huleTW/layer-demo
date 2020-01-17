package com.example.onion.ui;

import com.example.onion.application.domainmodel.Task;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class TaskResponse {

    private String id;

    public static List<TaskResponse> of(List<Task> tasks) {
        return tasks.stream().map(TaskResponse::of).collect(Collectors.toList());
    }

    public static TaskResponse of(Task task) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setId(task.getId());
        return taskResponse;
    }

}
