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
@Table(name= "USERSINFO")
@SequenceGenerator(name = "userIdGenerator", sequenceName = "USERSINFO_SEQ", initialValue = 1, allocationSize = 1)
public class UserInfo extends BaseModel {

    @Column(length = 50, nullable = false)
    private String fName;

    @Column(length = 50, nullable = false)
    private String lName;

    @Column(length = 50, nullable = false)
    private Integer age;




}
