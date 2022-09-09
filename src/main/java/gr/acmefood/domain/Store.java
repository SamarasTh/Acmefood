package gr.acmefood.domain;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
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


    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    private StoreCategory storeCategory;

    @NotNull
    @Column(length = 50, nullable = false)
    private String name;

    @NotNull
    @Column(length = 50, nullable = false)
//    @OneToOne(fetch = FetchType.EAGER)
    private String address;

    @NotNull
    @OneToMany(mappedBy = "store", cascade = CascadeType.MERGE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Product> products;

    @NotNull
    @Column(length = 1000)
    private String imgUrl;

}
