package com.bhushan.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRespository todoRespository;

    public List<Todo> getAllTasks() {
        List<Todo> allTodo = todoRespository.findAll();
        return allTodo;
    }

    public Todo saveTodo(Todo todo) {
        return todoRespository.save(todo);
    }

}
