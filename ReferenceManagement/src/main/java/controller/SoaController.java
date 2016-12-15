package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SoaController {
    @RequestMapping(value = {"/", "soa/list"})
    public String list(){
        return "this is list from spring mvc.";
    }
}
