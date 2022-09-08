package gr.acmefood.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORE_CATEGORIES")
public class StoreCategory extends BaseModel {

    @NotNull
    @Column(length = 20, nullable = false)
    private String name;

    @NotNull
    @Column(length = 1000, nullable = false)
    private String imgUrl;


}
