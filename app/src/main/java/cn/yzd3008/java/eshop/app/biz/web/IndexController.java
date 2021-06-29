package cn.yzd3008.java.eshop.app.biz.web;

import cn.yzd3008.java.eshop.app.biz.entity.ProductEntity;
import cn.yzd3008.java.eshop.app.biz.repository.ProductRepository;
import cn.yzd3008.java.eshop.app.biz.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ProductService productService;

    @GetMapping({"/index", ""})
    public String getIndex(Model model){

        log.debug("=== Start: getALlProducts()");

        List<ProductEntity> products = this.productService.getAllProducts();
        model.addAttribute("products", products);

        log.debug("=== Found all products: {}", products);

        return "product/list-product";
    }
}
