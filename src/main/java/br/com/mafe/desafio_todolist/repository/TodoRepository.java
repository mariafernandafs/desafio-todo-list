package br.com.mafe.desafio_todolist.repository;

import br.com.mafe.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
