package br.com.mafe.desafio_todolist.service;

import br.com.mafe.desafio_todolist.entity.Todo;
import br.com.mafe.desafio_todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return listagem();
    }
    public List<Todo> listagem(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }
    public List<Todo> atualiza(Todo todo){
        todoRepository.save(todo)
        return listagem();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return listagem();

    }
}
