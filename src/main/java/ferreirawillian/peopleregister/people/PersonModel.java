package ferreirawillian.peopleregister.people;

import ferreirawillian.peopleregister.task.TaskModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//transforma em uma entidade(tabela) no banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_people")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cpf;

    private String dateOfBirth;

    private String email;

    private String job;

    @OneToMany(mappedBy = "person")//Uma pessoa com muitas missoes
    private List<TaskModel> tasks;

}