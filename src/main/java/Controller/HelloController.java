package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Key on 6/8/16.
 */
@Controller
public class HelloController {
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
