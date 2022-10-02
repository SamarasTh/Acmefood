package gr.acmefood.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ACCOUNTS")
public class Account extends BaseModel {

    @NotNull
    @Column(length = 50, nullable = false)
    private String username;

    @NotNull
    @Column(length = 50, nullable = false)
    private String password;

    @Email
    @NotNull
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @NotNull
    @Column(length = 50, nullable = false, unique = true)
    private String phone;

    @ToString.Exclude
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Address> addressList;

    @NotNull
    @Column(length = 50, nullable = false)
    private String fName;

    @NotNull
    @Column(length = 50, nullable = false)
    private String lName;

    @NotNull
    @Column(length = 50, nullable = false)
    @Min(value = 12, message = "Too young for this app")
    private Integer age;

}
