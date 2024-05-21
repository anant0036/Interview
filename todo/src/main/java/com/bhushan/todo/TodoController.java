package com.bhushan.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("todo")
    public ResponseEntity<?> listOfTodos() {
        return new ResponseEntity<>(todoService.getAllTasks(), HttpStatus.OK);
    }

    @PostMapping("todo")
    public ResponseEntity<?> saveTodo(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.saveTodo(todo), HttpStatus.CREATED);
    }

}
