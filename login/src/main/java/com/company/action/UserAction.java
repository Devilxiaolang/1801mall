package com.company.action;

import com.company.commons.Commons;
import com.company.dao.pojo.Emp;
import com.company.service.dto.Loginvo;
import com.company.service.dto.MyResponseEntity;
import com.company.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class UserAction {
    @Autowired
    @Qualifier("userService")
    UserServiceImpl userService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(Map<String,Object> map,Loginvo loginvo){
        System.out.println(loginvo);
        if(userService.login(loginvo)){
            return "redirect:/empAction/emps/1/5";
        }else{
            return "redirect:/error.jsp";
        }
    }

    @RequestMapping(value = "isuser.do",method = RequestMethod.GET)
    public @ResponseBody MyResponseEntity userjson(@RequestParam String username){
        System.out.println(username);
        boolean flag = userService.isUserExist(username);
        MyResponseEntity mre = null;
        if (flag){
            mre = new MyResponseEntity(200,"success");
        }else{
            mre = new MyResponseEntity(404,"error");
        }
        return mre;
    }
}
