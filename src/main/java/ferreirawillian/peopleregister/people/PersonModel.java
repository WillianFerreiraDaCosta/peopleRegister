package ferreirawillian.peopleregister.people;

import ferreirawillian.peopleregister.task.TaskModel;
import jakarta.persistence.*;

//transforma em uma entidade(tabela) no banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_people_register")
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String dateOfBirth;
    private String email;
    private String job;
    @OneToMany(mappedBy = "PersonModel") //Uma pessoa com muitas missoes
    private List<TaskModel> tasks;

    public PersonModel() {}

    /*
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * arrumar os construtores, aula 7, 18:30
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */

    public PersonModel(String cpf, String dateOfBirth, String email, String job, String name) {
        setCpf(cpf);
        setDateOfBirth(dateOfBirth);
        setEmail(email);
        setJob(job);
        setName(name);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }
}