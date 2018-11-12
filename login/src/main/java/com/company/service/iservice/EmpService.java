package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Emp;
import com.company.service.dto.MyResponseEntity;
import com.company.service.dto.PageVo;

public interface EmpService {
    public String save(Emp emp);
    public String update(Emp emp);
    public String delete(Emp emp);
    public List<Emp> findAll();
    public List<Emp> findByPage(PageVo pageVo);
    public Emp findById(Integer empno);
    public List<Emp> findByName(String ename);
}
