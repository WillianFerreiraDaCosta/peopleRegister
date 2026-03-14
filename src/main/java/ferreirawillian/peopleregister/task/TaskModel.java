package ferreirawillian.peopleregister.task;

import ferreirawillian.peopleregister.people.PersonModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)// Força o JPA a gravar como texto (VARCHAR) em vez do número da posição (ORDINAL).
    private TaskPriority task;//Mais tarde analisar melhor maneira de fazer a leitura das 4 prioridades
    private boolean isCompleted;
    @ManyToOne //muitas missoes pra uma pessoa
    @JoinColumn(name = "person_id") //foring key
    private PersonModel person;

    public TaskModel(long id, boolean isCompleted, String name, TaskPriority task) {
        this.id = id;
        this.isCompleted = isCompleted;
        this.name = name;
        this.task = task;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskPriority getTask() {
        return task;
    }

    public void setTask(TaskPriority task) {
        this.task = task;
    }
}
