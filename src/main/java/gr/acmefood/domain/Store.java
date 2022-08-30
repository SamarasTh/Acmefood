package gr.acmefood.domain;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORES")
public class Store extends BaseModel {

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(length = 10, nullable = false)
    private StoreCategory storeCategory;

    @NotNull
    @Column(length = 50, nullable = false)
    private String name;

    @NotNull
    @Column(length = 50, nullable = false)
    @OneToOne(fetch = FetchType.EAGER)
    private Address address;

    @NotNull
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<@NotNull Product> products;

}
