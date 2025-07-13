# To-Do List - Progetto `toDoList`

Questa lista tiene traccia delle attività da svolgere, dei miglioramenti futuri e dello stato di avanzamento del progetto `toDoList`.

---

## ✅ Task completati
- [x] Collegamento repository GitHub
- [x] Implementazione base dei DTO
- [x] Integrazione Swagger (prima versione)
- [x] Aggiunti metodi **PUT** e **DELETE** per Task.java @rick-manf
- [x] Aggiunta `TaskNotFoundException` per gestire errori custom
- [x] Implementato `GlobalExceptionHandler` con `@RestControllerAdvice`
- [x] Dockerizzazione del progetto (per ora su branch a parte)
- [x] Utilizzare `@Value` per endpoint esterni (vedi branch feature/externalService)
- [X] Aggiungere l'entity 'User'
- [X] Aggiunto Lombok
- [X] Aggiunta configurazione per TiDB (DB remoto)
- [X] Collegare User e Task con una relazione `@ManyToOne` o `@OneToMany`



---

## 🚧 Task in corso

    //TODO!!!
- [ ] Creata la relazione tra le entity ora vanno gestiti i service 
    Apri queste finestre chrome: 
    Chat: https://chatgpt.com/g/g-p-68287bcc2d5481919e06a1ba628b1eca-progetto-task/c/68739a54-340c-800d-bba7-dd047578e0b0
    TiDB: https://tidbcloud.com/clusters/10522434590372284509/sqleditor?orgId=1372813089209270714&projectId=1372813089454588489
    Swagger: http://localhost:8080/swagger-ui/index.html#/task-controller/createTask

- [ ] JUnit testing 

---

## 💡 Miglioramenti futuri

- [ ] Implementare Page<Task> e Page<User> per paginazione 

- [ ] Creare una @Post per ricerca avanzata di Task e User e implementare `@RequestBody` per i filtri

- [ ] Personalizzare serializzazione JSON con `@JsonProperty`
- [ ] Aggiungere `@JsonIgnoreProperties` per evitare serializzazione ciclica
- 
- [ ] Implementare `@Transactional` per le operazioni di scrittura

- [ ] Implementare `LOGGER` nei service/controller
- [ ] Simulare chiamate HTTP esterne con **WireMock**



- [ ] Sviluppare FrontEnd dell'applicativo
- [ ] Sicurezza (Spring Security)

---

## 🔍 Idee da valutare
- [ ] Separazione modulo API vs. modulo logica (multi-modulo)
- [ ] Deploy su server remoto o cloud


---

> 🔄 Sentiti libero di modificare, aggiornare o spostare le attività in base all’avanzamento.
> Ricorda di avvisare il team quando aggiorni questo file, aggiungendo anche la data e il tuo nome a piè di pagina.
