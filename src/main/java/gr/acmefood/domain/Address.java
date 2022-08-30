package gr.acmefood.domain;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ADDRESSES")
public class Address extends BaseModel {
    @NotNull
    @Column(length = 50, nullable = false)
    private String state;

    @NotNull
    @Column(length = 50, nullable = false)
    private String city;

    @NotNull
    @Column(length = 50, nullable = false)
    private String streetName;

    @NotNull
    @Column(length = 50, nullable = false)
    private Integer StreetNumber;

    @NotNull
    @Column(length = 50, nullable = false)
    private Integer postalCode;

    @NotNull
    @Column(length = 50, nullable = false)
    private Integer floor;

    @NotNull
    @Column(length = 50, nullable = false)
    private String doorbellName;


}
