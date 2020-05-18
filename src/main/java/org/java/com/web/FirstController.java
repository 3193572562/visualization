package org.java.com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {


    @RequestMapping("index")
    public String index(){
        return "index";
    }




}
