package gr.acmefood.controller;

import gr.acmefood.domain.StoreCategory;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.StoreCategoryService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class StoreCategoryController extends AbstractController<StoreCategory> {

    private final StoreCategoryService storeCategoryService;

    @Override
    protected BaseService<StoreCategory> getBaseService() {
        return storeCategoryService;
    }

    @GetMapping(params = "categoryId", value = "/category-by-categoryId")
    public ResponseEntity<ApiResponse<StoreCategory>> getStoreByStoreId(@RequestParam Long categoryId) {
        final StoreCategory storeCategory = storeCategoryService.findById(categoryId);
        if (storeCategory == null) {
            throw new NoSuchElementException("StoreCategory for this storeCategory id not found");
        }
        return ResponseEntity.ok(ApiResponse.<StoreCategory>builder().data(storeCategory).build());
    }
}
