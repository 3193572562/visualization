package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {


    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("index2")
    public String index2(){
        return "index2";
    }

}
