package org.test.demo.contorller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/admin")
    public void admin(){
    }

    @RequestMapping("/login")
    public void login(){

    }
}
