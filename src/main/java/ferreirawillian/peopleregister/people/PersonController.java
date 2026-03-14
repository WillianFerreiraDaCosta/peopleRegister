package ferreirawillian.peopleregister.people;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.ConstructorProperties;

@RestController
@RequestMapping
public class PersonController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Ola, primeira mensagem nessa rota!!";
    }
}
