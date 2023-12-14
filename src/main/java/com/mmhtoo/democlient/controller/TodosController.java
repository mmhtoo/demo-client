package com.mmhtoo.democlient.controller;

import com.mmhtoo.democlient.dto.Todo;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;


@RestController
@AllArgsConstructor
public class TodosController {

    private final RestClient restClient;

    @GetMapping( value = "/todos" )
    public ResponseEntity<?> getTodos(){
        var todos = restClient.get()
                .uri("/todos")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(List.class);
        return ResponseEntity.ok(todos);
    }

    @PostMapping( value = "/todos" )
    public Object postTodo(
            @RequestBody Todo newTodo
    ){
        return restClient.post()
                .uri("/todos")
                .accept(MediaType.APPLICATION_JSON)
                .body(newTodo)
                .retrieve().body(Object.class);
    }

}
