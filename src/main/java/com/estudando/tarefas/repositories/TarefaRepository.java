package com.estudando.tarefas.repositories;

import com.estudando.tarefas.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    Optional<Tarefa> findById(Long id);
}
