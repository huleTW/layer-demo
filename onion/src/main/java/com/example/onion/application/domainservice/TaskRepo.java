package com.example.onion.application.domainservice;

import com.example.onion.application.domainmodel.Task;

import java.util.List;

public interface TaskRepo {
    List<Task> queryAllTask();
}
