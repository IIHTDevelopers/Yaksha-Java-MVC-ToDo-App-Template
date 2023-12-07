package com.yaksha.training.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

	List<Todo> findByTask(@Param("keyword") String keyword);
}
