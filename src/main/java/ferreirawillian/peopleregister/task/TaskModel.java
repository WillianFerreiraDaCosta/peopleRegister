package ferreirawillian.peopleregister.task;

import ferreirawillian.peopleregister.people.PersonModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
