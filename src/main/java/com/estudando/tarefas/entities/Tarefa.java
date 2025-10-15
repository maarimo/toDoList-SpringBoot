package com.estudando.tarefas.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "tabelas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDate dataLimite;
    private boolean concluida;
}
