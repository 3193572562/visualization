package org.java.web.factory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForWordController {

    @RequestMapping("/forword/{target}/{page}")
    public String forword(@PathVariable("target") String target,@PathVariable("page") String page){
        return target+"/"+page;
    }

}
