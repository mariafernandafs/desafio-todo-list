package br.com.mafe.desafio_todolist.controller;

import br.com.mafe.desafio_todolist.entity.Todo;
import br.com.mafe.desafio_todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    List<Todo> listagem(){
        return todoService.listagem();
    }
    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.atualiza(todo);
    }
    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
