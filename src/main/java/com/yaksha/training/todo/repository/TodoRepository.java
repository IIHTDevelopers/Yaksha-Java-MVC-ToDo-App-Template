package com.yaksha.training.todo.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

	// feel free to update this
	Page<Todo> findAllTodo(Pageable pageable);

	// feel free to update this
	Page<Todo> findByTaskAndDescAndDate(@Param("keyword") String keyword, @Param("taskDate") LocalDate taskDate,
			Pageable pageable);

	// feel free to update this
	void updateTodoStatus(@Param("id") Long id, @Param("status") String status);
}
