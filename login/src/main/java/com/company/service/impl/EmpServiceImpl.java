package com.company.service.impl;

import java.util.List;

import com.company.commons.Commons;
import com.company.dao.idao.EmpDao;
import com.company.dao.pojo.Emp;
import com.company.service.dto.PageVo;
import com.company.service.iservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	@Qualifier("empDao")
	EmpDao empdao;
	@Override
	public String save(Emp emp) {
		String msg = Commons.ERROR;
		try {
			empdao.save(emp);
			msg = Commons.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String update(Emp emp) {
		String msg = Commons.ERROR;
		try {
			empdao.update(emp);
			msg = Commons.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String delete(Emp emp) {
		String msg = Commons.ERROR;
		try {
			empdao.delete(emp);
			msg = Commons.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Emp> findAll() {
		List<Emp> emps = null;
		try {
			emps = empdao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	}

	@Override
	public List<Emp> findByPage(PageVo pageVo) {
		List<Emp> emps = null;
		try {
			emps = empdao.findByPage(pageVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	}

	@Override
	public Emp findById(Integer empno) {
		Emp emp = null;
		try {
			emp = empdao.findById(empno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Emp> findByName(String ename) {
		List<Emp> emps = null;
		try {
			emps = empdao.findByName(ename);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	}

}
