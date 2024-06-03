package com.yaksha.training.todo.service;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.todo.entity.Todo;

@Service
public class TodoService {

	public Page<Todo> getTodos(Pageable pageable) {
		// write your logic here
		return null;
	}

	public Todo saveTodo(Todo todo) {
		// write your logic here
		return null;
	}

	public Todo getTodo(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteTodo(Long id) {
		// write your logic here
		return false;
	}

	public Page<Todo> searchTodos(String theSearchName, LocalDate theSearchDate, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean updateTodoStatus(Long id, String status) {
		// write your logic here
		return false;
	}
}
