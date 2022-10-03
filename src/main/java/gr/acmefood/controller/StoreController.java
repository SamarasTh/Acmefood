package gr.acmefood.controller;

import gr.acmefood.domain.Product;
import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.StoreService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("stores")
public class StoreController extends AbstractController<Store> {
    private final StoreService storeService;

    @Override
    public BaseService<Store> getBaseService() {
        return storeService;
    }


    @GetMapping(params = "storeCategoryId", value = "/store-by-category")
    public ResponseEntity<ApiResponse<List<Store>>> findByStoreCategory(@RequestParam Long storeCategoryId) {
        final List<Store> byStoreCategory = storeService.findByStoreCategoryId(storeCategoryId);
        if (byStoreCategory == null || byStoreCategory.isEmpty()) {
            throw new NoSuchElementException("Stores for this category not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Store>>builder().data(byStoreCategory).build());
    }

    @GetMapping(params = "storeName", value = "/stores-by-name")
    public ResponseEntity<ApiResponse<List<Store>>> findByName(@Valid @RequestParam String storeName) {
        final List<Store> byStoreName = storeService.findByNameLike(storeName);
        if (byStoreName == null) {
            throw new NoSuchElementException("Store not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Store>>builder().data(byStoreName).build());
    }

    @GetMapping(params = "storeId", value = "/products-by-store")
    public ResponseEntity<ApiResponse<List<Product>>> getByStoreId(@RequestParam Long storeId) {
        final List<Product> byStore = storeService.findById(storeId).getProducts();
        if (byStore == null || byStore.isEmpty()) {
            throw new NoSuchElementException("Products for this Store not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Product>>builder().data(byStore).build());
    }

    @GetMapping(params = "storeId", value = "/store-by-storeid")
    public ResponseEntity<ApiResponse<Store>> getStoreByStoreId(@RequestParam Long storeId) {
        final Store store = storeService.findById(storeId);
        if (store == null) {
            throw new NoSuchElementException("Store for this Store id not found");
        }
        return ResponseEntity.ok(ApiResponse.<Store>builder().data(store).build());
    }

    @GetMapping(value = "/famous-stores")
    public ResponseEntity<ApiResponse<List<Store>>> findMostFamousStores() {
        final List<Store> famousStores = storeService.getMostFamousStoreS();
        if (famousStores == null || famousStores.isEmpty()) {
            throw new NoSuchElementException("Most famous stores do not exist");
        }
        return ResponseEntity.ok(ApiResponse.<List<Store>>builder().data(famousStores).build());
    }


}
