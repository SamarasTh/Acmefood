package gr.acmefood.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    @JoinColumn(foreignKey = @ForeignKey(name = "FK__ORDERS__ACCOUNT__ID"))
    @NotNull
    private Account account;

    @NotNull
    @Column
    private Long selectedAddressId;


    @NotNull
    @Column
    private Long storeId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @NotNull
    private Date submitDate;

    @Column(precision = 10, scale = 2, nullable = false)
    @NotNull
    private BigDecimal cost;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @NotNull
    private List<OrderItem> orderItems;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(length = 15, nullable = false)
    private PaymentMethod paymentMethod;

}
