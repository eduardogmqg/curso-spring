package space.pentaquark.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class SillyController {

    @RequestMapping("/showForm1")
    public String displayTheForm() {
        return "silly";
    }

}
