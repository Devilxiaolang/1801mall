package com.company.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Router {
    @RequestMapping(value = "router/{path}",method = RequestMethod.GET)
    public String router(@PathVariable(value = "path") String path){
        if (path.equals("save")){
            return "emp_save";
        }else{
            return "redirect:/empAction/emps/1/5";
        }

    }
}
