package com.company.service.impl;

import java.util.List;

import com.company.commons.Commons;
import com.company.dao.idao.ProductDao;
import com.company.dao.pojo.Product;
import com.company.service.dto.PageVo;
import com.company.service.iservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	@Autowired
	@Qualifier("productDao")
    ProductDao productdao;

	@Override
	public List<Product> findByPage(PageVo pageVo) {
		List<Product> products = null;
		try {
			products = productdao.findByPage(pageVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}


	@Override
	public double getTotalNums() {
		double totalnum=0;
		try {
			totalnum = productdao.getTotalNums();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalnum;
	}

}
