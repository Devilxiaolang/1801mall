package com.company.service.iservice;

import com.company.dao.pojo.Product;
import com.company.service.dto.PageVo;

import java.util.List;

public interface ProductService{
    double getTotalNums();
    public List<Product> findByPage(PageVo pageVo);
}
