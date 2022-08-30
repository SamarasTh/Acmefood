package gr.acmefood.domain;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_CATEGORIES")
public class ProductCategory extends BaseModel {

    @NotNull
    @Column(length = 30, nullable = false)
    private String name;

}
