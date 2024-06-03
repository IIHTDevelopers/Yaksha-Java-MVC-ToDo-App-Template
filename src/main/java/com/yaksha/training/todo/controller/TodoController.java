package com.yaksha.training.todo.controller;

import java.time.LocalDate;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.todo.entity.Todo;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/todo", "/" })
public class TodoController {

	@GetMapping(value = { "/list", "/" })
	public String listTodos(@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/addTodoForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveTodo")
	public String saveTodo(@Valid @ModelAttribute("todo") Todo todo, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateTodoForm")
	public String showFormForUpdate(@RequestParam("todoId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteTodo(@RequestParam("todoId") Long id) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchTodos(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@RequestParam(value = "theSearchDate", required = false) LocalDate theSearchDate,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateStatus")
	public String updateStatus(@RequestParam("todoId") Long id, @RequestParam("status") String status) {
		// write your logic here
		return "";
	}
}
