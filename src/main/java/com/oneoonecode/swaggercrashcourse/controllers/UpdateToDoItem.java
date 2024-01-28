package com.oneoonecode.swaggercrashcourse.controllers;


import com.oneoonecode.swaggercrashcourse.models.ToDoItem;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.print.attribute.standard.Media;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import org.springframework.http.MediaType;

@RestController
public class UpdateToDoItem {
    @PutMapping(value = "/todos/{toDoItemId}")
    @Operation(
    		tags = {"TodoItem","TodoItem1"},
    		operationId = "updateToDo", 
    		summary = "this is the summary",
    		description = "this is the description",
    		requestBody = @RequestBody(
    				description="this is the rwquest body of the descritption",
    				content =  @Content(schema = @Schema(implementation = ToDoItem.class))),
    				parameters = {@Parameter(name="toDoItemId", description = "The path variable.",example = "4435")},
    				externalDocs = @ExternalDocumentation(url="http://www.external-documentation-path", description = "for more details check the link"),
    				responses = {@ApiResponse(
    						responseCode = "200", 
    						content = @Content(schema = @Schema(implementation = ToDoItem.class), mediaType = MediaType.APPLICATION_JSON_VALUE ,
    						examples = {@ExampleObject(name = "sucess reply 1", value = "Object"), @ExampleObject(name = "sucess reply 2", value = "String")}), 
    						description = "This is the Success response example" )},
    				security = {@SecurityRequirement(name = "BearerJWT")}
    )
    public ResponseEntity<Object> updateToDoItem(@PathVariable String toDoItemId,
                                                 @RequestBody ToDoItem toDoItem,
                                                 @CookieValue(required = false) String canEdit,
                                                 @RequestHeader Boolean fromHost,
                                                 @RequestParam Boolean isClient) {
        return ResponseEntity.ok().body(toDoItem);
    }
}
