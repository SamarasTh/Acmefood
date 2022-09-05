package gr.acmefood.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serial;
import java.io.Serializable;

@Getter
@ToString
@MappedSuperclass
public abstract class BaseModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idGenerator")
    @Column(updatable = false)
    private Long id;
}
