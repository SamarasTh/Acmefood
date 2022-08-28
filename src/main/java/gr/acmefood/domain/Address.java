package gr.acmefood.domain;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ADDRESSES")
@SequenceGenerator(name = "addressIdGenerator", sequenceName = "ADDRESSES_SEQ", initialValue = 1, allocationSize = 1)
public class Address extends BaseModel {

    @Column(length = 50, nullable = false)
    private String state;

    @Column(length = 50, nullable = false)
    private String city;

    @Column(length = 50, nullable = false)
    private String streetName;

    @Column(length = 50, nullable = false)
    private Integer StreetNumber;

    @Column(length = 50, nullable = false)
    private Integer postalCode;

    @Column(length = 50, nullable = false)
    private Integer floor;

    @Column(length = 50, nullable = false)
    private String doorbellName;


}
