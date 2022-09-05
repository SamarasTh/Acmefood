package gr.acmefood.transfer;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Value
public class ApiResponse<T> implements Serializable {

    T data;

    ApiError apiError;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    LocalDateTime localDateTime = LocalDateTime.now();
}
