package com.example.onion.infrastracture.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskJPARepository extends JpaRepository<TaskDBO, String> {
}
