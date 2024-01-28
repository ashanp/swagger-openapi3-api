package com.oneoonecode.swaggercrashcourse.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class DeleteToDoItem {
    @DeleteMapping(value = "/todos/{toDoItemId}")
    @Operation(
    		tags = {"TodoItem"}    
    )
    public ResponseEntity<Object> deleteToDoItem(@PathVariable String toDoItemId) {
        return ResponseEntity.ok().body("ToDo Item Deleted");
    }
}
