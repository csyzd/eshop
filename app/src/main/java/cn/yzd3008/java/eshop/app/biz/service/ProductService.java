package cn.yzd3008.java.eshop.app.biz.service;

import cn.yzd3008.java.eshop.app.biz.entity.ProductEntity;
import cn.yzd3008.java.eshop.app.biz.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductEntity addProduct(ProductEntity productEntity) {

        log.debug("=== Start: ProductService#addProduct({})", productEntity);
        ProductEntity product = this.productRepository.save(productEntity);

        return product;
    }

    public List<ProductEntity> getAllProducts(){

        log.debug("=== Start: ProductService#getAllProducts()");
        List<ProductEntity> products = this.productRepository.findAll();
        log.debug("=== All products: {}", products);

        return products;
    }
}
