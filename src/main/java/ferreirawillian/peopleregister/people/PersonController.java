package ferreirawillian.peopleregister.people;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PersonController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Ola, primeira mensagem nessa rota!!";
    }

    //Adicinar pessoa (CREATE)
    @PostMapping("/create/person")
    public String createPerson(){
        return "Your Person is Created";
    }

    //Mostrar todas as pessoas (CREATE)
    @GetMapping("/showById/person")
    public String showById(){
        return "Show Person";
    }

    //Mostrar todas as pessoas (Read)
    @GetMapping("/all/person")
    public String showAllPerson(){
        return "Show all";
    }

    //Editar pessoa (UPDATE)
    @PutMapping("/editById/person")
    public String editPersonById(){
        return "Person edited";
    }

    //Deletar pessoa (DELETE)
    @DeleteMapping("/deleteByID/person")
    public String deleteById(){
        return "Person Deleted";
    }

}
