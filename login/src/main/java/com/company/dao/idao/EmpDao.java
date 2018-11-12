package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Emp;
import com.company.service.dto.PageVo;

public interface EmpDao {
    public void save(Emp emp);
    public void update(Emp emp);
    public void delete(Emp emp);
    public List<Emp> findAll();
    public List<Emp> findByPage(PageVo pageVo);
    public Emp findById(Integer empno);
    public List<Emp> findByName(String ename);
}
