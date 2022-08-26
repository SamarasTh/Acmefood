package gr.acmefood.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCTS")
@SequenceGenerator(name = "productIdGenerator", sequenceName = "PRODUCTS_SEQ", initialValue = 1, allocationSize = 1)
public class Product extends BaseModel{

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Store store;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 150, nullable = false)
    private String description;

    @OneToOne(fetch = FetchType.EAGER)
    private ProductCategory productCategory;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal price;



}
