# Gerenciador de Tarefas


## Sobre o projeto

Esse é um **projeto de estudo** desenvolvido para praticar conceitos de **Spring Boot, JPA/Hibernate, REST APIs e validação**.  
Ele funciona como um **gerenciador de tarefas**, permitindo criar, listar, atualizar e deletar tarefas, com dados armazenados em um banco H2 em memória.

Este projeto é voltado para fins de aprendizado e demonstração de habilidades em desenvolvimento backend com Java.

---

## Funcionalidades

- Criar novas tarefas
- Listar todas as tarefas
- Buscar tarefa por ID
- Atualizar tarefas existentes
- Deletar tarefas
- Visualização do banco em memória via **H2 Console**

---

## Tecnologias utilizadas

- Java 17  
- Spring Boot 3.5.6  
- Spring Web (REST API)  
- Spring Data JPA  
- H2 Database (em memória)  
- Bean Validation (`@Valid`)  
- Lombok  

---

## Estrutura do projeto


---

## Endpoints disponíveis

| Método | Endpoint           | Descrição                     |
|--------|------------------|--------------------------------|
| GET    | /tarefas          | Lista todas as tarefas         |
| GET    | /tarefas/{id}     | Busca tarefa por ID            |
| POST   | /tarefas          | Cria nova tarefa               |
| PUT    | /tarefas/{id}     | Atualiza tarefa existente      |
| DELETE | /tarefas/{id}     | Deleta tarefa                  |

---
