package com.company.action;

import com.company.commons.Commons;
import com.company.dao.pojo.Emp;
import com.company.service.dto.MyResponseEntity;
import com.company.service.dto.PageVo;
import com.company.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("empAction")
public class EmpAction {
    @Autowired
    @Qualifier("empService")
    EmpServiceImpl empService;
    @RequestMapping(value = "emp",method = RequestMethod.POST)
    public String save(Map<String,Object> map, Emp emp){
        String msg = empService.save(emp);
        if (msg.equals(Commons.SUCCESS)){
            map.put("res",new MyResponseEntity<List<Emp>>(200,"save success"));
        }else{
            map.put("res",new MyResponseEntity<List<Emp>>(404,"save error"));
        }
        return "show_emp";
    }
    @RequestMapping(value = "emp/{type}/{empno}",method = RequestMethod.GET)
    public String findById(Map<String,Object> map,@PathVariable(value = "type") String type ,@PathVariable(value = "empno") Integer empno){
        Emp emp = empService.findById(empno);
        if(emp!=null){
            //如果进行的是update，就返回emp对象，并且跳转到emp_update.jsp
            if(type.equals("update")){
                map.put("res",new MyResponseEntity(200,"findbyid success",emp));
                return "emp_update";
            }else{
                List<Emp> emps = new ArrayList<Emp>();
                emps.add(emp);
                map.put("res",new MyResponseEntity<List<Emp>>(200,"findbyid success",emps));
                return "emps";
            }
        }else{
            map.put("res",new MyResponseEntity(200,"findbyid error"));
            return "redirect:/error.jsp";
        }
    }
    @RequestMapping(value = "emps/{page}/{size}",method = RequestMethod.GET)
    public String findByPage(Map<String,Object> map, @PathVariable(value="page") Integer page,@PathVariable(value = "size") Integer size){
        PageVo pageVo = new PageVo(page,size);
        List<Emp> emps = empService.findByPage(pageVo);
        if (emps.size()>0){
            map.put("res",new MyResponseEntity<List<Emp>>(200,page+"success",emps));
        }else{
            map.put("res",new MyResponseEntity<List<Emp>>(404,"error"));
        }

        return "emps";
    }
    @RequestMapping(value = "emp/{empno}",method = RequestMethod.PUT)
    public String update(Map<String,Object> map, Emp emp){
        String msg = empService.update(emp);
        if(msg.equals(Commons.SUCCESS)){
            map.put("res",new MyResponseEntity(200,"update success"));
        }else{
            map.put("res",new MyResponseEntity(500,"update error"));
        }
        return "redirect:/empAction/emps/1/5";// return "show_emp2"; tomcat8转发会出现bug 所以直接重定向到emps
    }

    @RequestMapping(value = "emp/{empno}",method = RequestMethod.DELETE)
    public String delete(Map<String,Object> map, @PathVariable(value = "empno") Integer empno){
        Emp emp = empService.findById(empno);
        String msg = empService.delete(emp);
        if(msg.equals(Commons.SUCCESS)){
            map.put("res",new MyResponseEntity(200,"delete success"));
        }else{
            map.put("res",new MyResponseEntity(500,"delete error"));
        }
        return "redirect:/empAction/emps/1/5";
    }
    @RequestMapping(value = "empfbn",method = RequestMethod.POST)
    public String findbyname(Map<String,Object> map,String ename){
        System.out.println(ename);
        List<Emp> emps = empService.findByName(ename);
        if(emps.size()>0&&emps!=null){
            map.put("res",new MyResponseEntity<List<Emp>>(200,"find success",emps));
        }else{
            map.put("res",new MyResponseEntity(500,"find error"));
        }
        return "emps";
    }
}
