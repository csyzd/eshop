package cn.yzd3008.java.eshop.app.biz.web;

import cn.yzd3008.java.eshop.app.biz.entity.ProductEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public ProductEntity getIndex(){
        return new ProductEntity(1, "Product 1", 123);
    }
}
