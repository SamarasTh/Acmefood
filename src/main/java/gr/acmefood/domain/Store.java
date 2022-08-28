package gr.acmefood.domain;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORES")
@SequenceGenerator(name = "storeIdGenerator", sequenceName = "STORES_SEQ", initialValue = 1, allocationSize = 1)
public class Store extends BaseModel {

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private StoreCategory storeCategory;

    @Column(length = 50, nullable = false)
    private  String name;

    @Column(length = 50, nullable = false)
    private String address;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;






}
