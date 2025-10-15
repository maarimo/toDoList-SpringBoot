package com.estudando.tarefas.services;

import com.estudando.tarefas.entities.Tarefa;
import com.estudando.tarefas.repositories.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repo;

    public TarefaService(TarefaRepository repo) {
        this.repo = repo;
    }

    public List<Tarefa> listar(){
        return repo.findAll();
    }

    public Tarefa buscarPorId(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada: " + id));
    }

    public Tarefa criar(Tarefa tarefa){
        return repo.save(tarefa);
    }

    public Tarefa atualizar(Long id, Tarefa tarefa){
        Tarefa existente = buscarPorId(id);
        existente.setTitulo(tarefa.getTitulo());
        existente.setDescricao(tarefa.getDescricao());
        existente.setDataLimite(tarefa.getDataLimite());
        return repo.save(existente);
    }

    public void deletar(Long id){
        Tarefa existente = buscarPorId(id);
        repo.delete(existente);
    }
}
