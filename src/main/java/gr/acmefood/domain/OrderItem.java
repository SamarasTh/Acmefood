package gr.acmefood.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("id")
    private Long productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private Order order;

    @NotNull
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal cost;

    @NotNull
    @Column(nullable = false)
    private Integer quantity;

}
