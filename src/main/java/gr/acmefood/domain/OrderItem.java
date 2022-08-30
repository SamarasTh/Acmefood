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
@Table(name = "ORDER_ITEMS")
public class OrderItem extends BaseModel {
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    @NotNull
    private Order order;

    @NotNull
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal cost;

    @NotNull
    @Column(nullable = false)
    private Integer quantity;

}
