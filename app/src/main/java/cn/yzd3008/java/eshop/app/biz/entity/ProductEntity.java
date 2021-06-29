package cn.yzd3008.java.eshop.app.biz.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", length = 11)
    private Integer productId;

    @Column(name = "product_name", length = 64)
    private String productName;

    @Column(name = "product_price", length = 8)
    private Integer productPrice;
}
