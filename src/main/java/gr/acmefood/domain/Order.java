package gr.acmefood.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
@SequenceGenerator(name = "orderIdGenerator", sequenceName = "ORDERS_SEQ", initialValue = 1, allocationSize = 1)
public class Order extends BaseModel {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Account account;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date submitDate;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal cost;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY )
    private Set<OrderItem> orderItems;

    @Enumerated(EnumType.STRING)
    @Column(length = 15, nullable = false)
    private PaymentMethod paymentMethod;

}
