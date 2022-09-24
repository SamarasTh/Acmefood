package gr.acmefood.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(length = 50, nullable = false)
    private String name;

    @NotNull
    @Column(length = 1150, nullable = false)
    private String description;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    private ProductCategory productCategory;

    @NotNull
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    @JsonIgnore
    private Store store;

    @NotNull
    @Column(length = 1000)
    private String imgUrl;

}
