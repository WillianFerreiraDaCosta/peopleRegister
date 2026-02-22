package ferreirawillian.peopleregister.people;

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
    private List<TaskModel> tasks;

    public PersonModel() {}

    public PersonModel(String cpf, String dateOfBirth, String email, String job, String name) {
        this.cpf = getCpf();
        this.dateOfBirth = getDateOfBirth();
        this.email = getEmail();
        this.job = getJob();
        this.name = getName();
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