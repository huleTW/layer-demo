package com.example.onion.infrastracture.task;

import com.example.onion.application.domainmodel.Task;
import com.example.onion.application.domainservice.TaskRepo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TaskRepoImpl implements TaskRepo {
    private TaskJPARepository taskJpaRepository;

    @Override
    public List<Task> queryAllTask() {
        return taskJpaRepository.findAll().stream().map(TaskDBO::to).collect(Collectors.toList());
    }
}
