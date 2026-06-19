package ferreirawillian.peopleregister.task;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class TaskController {

    @PostMapping("/create/task")
    public String createTask(){
        return "Created People";
    }

    @GetMapping("/showById/task")
    public String showAllTaskByIdd(){
        return "Show All Task By Id";
    }

    @GetMapping("/all/task")
    public String showAllTask(){
        return "Show All Task";
    }

   @PutMapping("/editById/task")
   public String editByIdTask(){
        return "Edit By Id";
   }

    @DeleteMapping("/deleteById/task")
    public String deleteByIdTask(){
        return "Delete Task";
    }
}
