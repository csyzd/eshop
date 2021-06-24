package cn.yzd3008.java.eshop.paymentservice.biz.repository;

import cn.yzd3008.java.eshop.paymentservice.biz.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

    ProductEntity findByProductId(Integer productId);

    List<ProductEntity> findByProductName(String productName);
}
