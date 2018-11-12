package com.company.dao.idao;

import com.company.dao.pojo.Product;
import com.company.service.dto.PageVo;

import java.util.List;

public interface ProductDao {
   public double getTotalNums();
   public List<Product> findByPage(PageVo pageVo);
}
