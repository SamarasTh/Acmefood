package gr.acmefood.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCTS")
public class Product extends BaseModel {


    @NotNull
    @Column(length = 30, nullable = false)
    private String serial;

    @NotNull
    @Column(length = 50, nullable = false)
    private String name;

    @NotNull
    @Column(length = 150, nullable = false)
    private String description;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    private ProductCategory productCategory;

    @NotNull
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_store")
    private Store store;
}
