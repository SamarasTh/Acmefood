package gr.acmefood.controller;

import gr.acmefood.domain.StoreCategory;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.StoreCategoryService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class StoreCategoryController extends AbstractController<StoreCategory> {

    private final StoreCategoryService storeCategoryService;

    @Override
    protected BaseService<StoreCategory> getBaseService() {
        return storeCategoryService;
    }

    @GetMapping("all")
    public ResponseEntity<ApiResponse<List<StoreCategory>>> getAllCategories() {
        final List<StoreCategory> storeCategories = storeCategoryService.findAll();
        return ResponseEntity.ok(ApiResponse.<List<StoreCategory>>builder().data(storeCategories).build());
    }
}
