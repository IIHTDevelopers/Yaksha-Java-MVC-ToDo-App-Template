package com.yaksha.training.todo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.todo.entity.Todo;

@Controller
@RequestMapping(value = { "/todo", "/" })
public class TodoController {

	@GetMapping(value = { "/list", "/" })
	public String listTodos(Model model) {
		return "";
	}

	@GetMapping("/addTodoForm")
	public String showFormForAdd(Model model) {
		return "";
	}

	@PostMapping("/saveTodo")
	public String saveTodo(@Valid @ModelAttribute("todo") Todo todo, BindingResult bindingResult) {
		return "";
	}

	@GetMapping("/updateTodoForm")
	public String showFormForUpdate(@RequestParam("todoId") Long id, Model model) {
		return "";
	}

	@GetMapping("/delete")
	public String deleteTodo(@RequestParam("todoId") Long id) {
		return "";
	}

	@PostMapping("/search")
	public String searchTodos(@RequestParam("theSearchName") String theSearchName, Model theModel) {
		return "";
	}
}
