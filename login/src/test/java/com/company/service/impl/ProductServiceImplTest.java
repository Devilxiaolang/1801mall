package com.company.service.impl;

import com.company.dao.pojo.Product;
import com.company.service.dto.PageVo;
import com.company.service.iservice.ProductService;
import commons.SpringTestCase;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceImplTest extends SpringTestCase {
    @Autowired
    @Qualifier("productService")
    ProductService productService;
    @Test
    public void findByPage() {
        List<Product> products = productService.findByPage(new PageVo(1,5));
    }

    @Test
    public void getTotalNums() {
    }
}