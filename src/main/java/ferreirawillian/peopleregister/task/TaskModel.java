package ferreirawillian.peopleregister.task;

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
}
