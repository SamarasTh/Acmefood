package gr.acmefood.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
}
