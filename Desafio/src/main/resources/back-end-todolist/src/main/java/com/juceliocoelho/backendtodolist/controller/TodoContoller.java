package com.juceliocoelho.backendtodolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juceliocoelho.backendtodolist.entity.Todo;
import com.juceliocoelho.backendtodolist.service.TodoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/todos")

public class TodoContoller {
    private TodoService todoService;

    
    
  public TodoContoller(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
   List<Todo> create(@RequestBody Todo todo){
    return todoService.create(todo);
  } 
  @GetMapping
  List<Todo> list(){
    return todoService.list();
  }
  @PutMapping
  List<Todo> update(@RequestBody Todo todo){
    return todoService.update(todo);
  }
  @DeleteMapping("{id}")
  List<Todo> delete(@PathVariable("id") Long id){
    return todoService.delete(id);
  }
}
 