package t1kons.testHh;
import LogicService.LogicService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {

    private LogicService logicService = new LogicService();

    @GetMapping("/{str}")
    public String getCharCount(@PathVariable String str, Model model) {

        String s = logicService.getCountCharsToString(str);
        model.addAttribute("str", s);
        return "greeting";
    }
}
