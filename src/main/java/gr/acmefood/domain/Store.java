package gr.acmefood.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String address;


    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @NotNull
    @JsonIgnore
    private List<Product> products;

    @NotNull
    @Column(length = 1000)
    private String imgUrl;


}
