package com.company.service.impl;

import commons.SpringTestCase;
import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.company.dao.pojo.Emp;

import java.util.List;

import static org.junit.Assert.*;

public class EmpServiceImplTest extends SpringTestCase {

    @Autowired
    @Qualifier("empService")
    EmpServiceImpl empService;
    private final Logger logger = LoggerFactory.getLogger(EmpServiceImplTest.class);
    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findAll() {
        List<Emp> emps = empService.findAll();
        TestCase.assertNotNull(emps);
        TestCase.assertTrue(emps.size()>0);
        logger.info(String.valueOf(emps.size()));
    }

    @Test
    public void findByPage() {
    }

    @Test
    public void findById() {

    }

    @Test
    public void findByName() {
    }
}