package gr.acmefood.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order extends BaseModel {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Account account;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @NotNull
    private Date submitDate;

    @Column(precision = 10, scale = 2, nullable = false)
    @NotNull
    private BigDecimal cost;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @NotNull
    private List<@NotNull OrderItem> orderItems;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(length = 15, nullable = false)
    private PaymentMethod paymentMethod;

}
