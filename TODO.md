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




---

## 🚧 Task in corso


---

## 💡 Miglioramenti futuri

- [ ] Creare una @Post per ricerca avanzata di Task e User e implementare `@RequestBody` per i filtri

- [ ] Personalizzare serializzazione JSON con `@JsonProperty`
- [ ] Aggiungere `@JsonIgnoreProperties` per evitare serializzazione ciclica
- 
- [ ] Implementare `@Transactional` per le operazioni di scrittura

- [ ] Implementare `LOGGER` nei service/controller
- [ ] Simulare chiamate HTTP esterne con **WireMock**


- [ ] Inserire test unitari e test di integrazione
- [ ] Sviluppare FrontEnd dell'applicativo
- [ ] Sicurezza (Spring Security)

---

## 🔍 Idee da valutare
- [ ] Separazione modulo API vs. modulo logica (multi-modulo)
- [ ] Deploy su server remoto o cloud


---

> 🔄 Sentiti libero di modificare, aggiornare o spostare le attività in base all’avanzamento.
> Ricorda di avvisare il team quando aggiorni questo file, aggiungendo anche la data e il tuo nome a piè di pagina.
