package com.company.action;

import com.company.dao.pojo.Product;
import com.company.service.dto.MyResponseEntity;
import com.company.service.dto.PageVo;
import com.company.service.dto.ProductFindByPageDTO;
import com.company.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductAction {
    @Autowired
    @Qualifier("productService")
    ProductServiceImpl productService;

    @RequestMapping(value = "products.do",method = RequestMethod.POST)
    public @ResponseBody MyResponseEntity<ProductFindByPageDTO> findByPage(@RequestBody PageVo pageVo){
        List<Product> products = productService.findByPage(pageVo);
        double totalnum = productService.getTotalNums();
        int totalpage = (int) Math.ceil(totalnum/pageVo.getSize());
        ProductFindByPageDTO dto = new ProductFindByPageDTO(totalpage,pageVo.getPage(),pageVo.getSize(), products);
        MyResponseEntity<ProductFindByPageDTO> mre = null;
        if(products.size()>0&&products!=null){
            mre = new MyResponseEntity<ProductFindByPageDTO>(200,"success",dto);
        }else{
            mre = new MyResponseEntity<ProductFindByPageDTO>(404,"error");
        }
        return mre;
    }
}
