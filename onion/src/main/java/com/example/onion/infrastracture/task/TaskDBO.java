package com.example.onion.infrastracture.task;

import com.example.onion.application.domainmodel.Task;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaskDBO {
    @Id
    private String id;


    public Task to() {
        Task task = new Task();
        task.setId(this.id);
        return task;
    }
}
