package com.estudando.tarefas.resources;

import com.estudando.tarefas.entities.Tarefa;
import com.estudando.tarefas.services.TarefaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaResource {

    private final TarefaService service;

    public TarefaResource(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listar(){
        List<Tarefa> list= service.listar();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscar(@PathVariable Long id){
        Tarefa t = service.buscarPorId(id);
        return ResponseEntity.ok(t);
    }

    @PostMapping
    public ResponseEntity<Tarefa> criar(@Valid @RequestBody Tarefa tarefa){
        Tarefa criada = service.criar(tarefa);
        URI uri = URI.create("/tarefas/" + criada.getId());
        return ResponseEntity.created(uri).body(criada);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @Valid @RequestBody Tarefa tarefa){
        Tarefa atualizada = service.atualizar(id, tarefa);
        return ResponseEntity.ok(atualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
