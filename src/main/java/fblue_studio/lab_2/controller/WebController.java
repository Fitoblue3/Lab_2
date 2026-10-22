package fblue_studio.lab_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/s")
    public String webS() {
        return "s";
    }

    @GetMapping("/o")
    public String webO() {
        return "o";
    }

    @GetMapping("/l")
    public String webL() {
        return "l";
    }

    @GetMapping("/i")
    public String webI() {
        return "i";
    }

    @GetMapping("/d")
    public String webD() {
        return "d";
    }
}
