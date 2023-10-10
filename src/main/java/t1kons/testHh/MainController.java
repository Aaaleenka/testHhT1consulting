package t1kons.testHh;
import LogicService.LogicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    private LogicService logicService = new LogicService();

    @GetMapping("/{str}")
    public ResponseEntity<String> getCharCount(@PathVariable String str) {

        String s = logicService.getCountCharsToString(str);
        return ResponseEntity.ok().body(s);
    }

}
