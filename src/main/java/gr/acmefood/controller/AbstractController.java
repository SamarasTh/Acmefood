package gr.acmefood.controller;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.BaseModel;
import gr.acmefood.service.BaseService;
import gr.acmefood.transfer.ApiResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
public abstract class AbstractController<T extends BaseModel> extends BaseComponent {

    protected abstract BaseService<T> getBaseService();

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<T>> get(@PathVariable("id") final Long id) {
        return ResponseEntity.ok(ApiResponse.<T>builder().data(getBaseService().get(id)).build());
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<T>>> findAll() {
        return ResponseEntity.ok(ApiResponse.<List<T>>builder().data(getBaseService().findAll()).build());
    }

    @PostMapping
    public ResponseEntity<ApiResponse<T>> create(@Valid @RequestBody final T entity) {
        return new ResponseEntity<>(ApiResponse.<T>builder().data(getBaseService().create(entity)).build(),
                HttpStatus.CREATED);
    }


}
