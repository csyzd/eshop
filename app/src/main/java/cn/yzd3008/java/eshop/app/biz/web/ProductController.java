package cn.yzd3008.java.eshop.app.biz.web;

import cn.yzd3008.java.eshop.app.biz.entity.ProductEntity;
import cn.yzd3008.java.eshop.app.biz.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/add-product")
    public String getAddProductPage(Model model){

        log.debug("=== Start: getAddProductPage");

        model.addAttribute("product", new ProductEntity(1, "Test Product 1", 25));

        log.debug("=== End: getAddProductPage");

        return "product/add-product";
    }

    @PostMapping("/add-product")
    public String postAddProduct(ProductEntity productEntity, Model model){

        log.debug("=== Start: postAddProduct({})", productEntity);
        ProductEntity product = this.productService.addProduct(productEntity);
        model.addAttribute("product", product);
        log.debug("=== End: postAddProduct");
        return "product/add-product-success";
    }


    @GetMapping("/view-product-details/{product-id}")
    public String getProductDetailsPage(Model model, @PathVariable("product-id") Integer productId){

        log.debug("=== Start: getProductDetailsPage()/{}", productId);

        ProductEntity productEntity = this.productService.getProductByProductId(productId);
        model.addAttribute("product", productEntity);
        log.debug("=== End: getProductDetailsPage");

        return "product/view-product-details";
    }

}
